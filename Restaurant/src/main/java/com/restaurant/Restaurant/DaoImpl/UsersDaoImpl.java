package com.restaurant.Restaurant.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.restaurant.Restaurant.Dao.UsersDao;
import com.restaurant.Restaurant.Model.Users;

@Repository
public class UsersDaoImpl implements UsersDao{

	@Autowired
    private SessionFactory sessionFactory;
	
	public List<Users> getUser() {
	        Session session = sessionFactory.getCurrentSession();
	        @SuppressWarnings("unchecked")
	        List<Users> list= session.createCriteria(Users.class).list();
	        return list;
	    }

	@Override
	public void createUser(Users user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		
	}	

	 public Users findById(int id) {
	        Session session = sessionFactory.getCurrentSession();
	        Users user=(Users) session.get(Users.class,id);
	        return user;
	    }

	@Override
	public Users update(Users currentUser, int user_id) {
		Session session = sessionFactory.getCurrentSession();
        Users user =(Users)session.get(Users.class, user_id);
        user.setUser_id(currentUser.getUser_id());
        user.setActive(true);
        session.update(user);
        return user;
	}

	@Override
	public void deleteUserById(int id) {
		 Session session = sessionFactory.getCurrentSession();
	        Users user = findById(id);
	        session.delete(user);
	}

	@Override
	public Users updatePartially(Users currentUser, int id) {
		Session session = sessionFactory.getCurrentSession();
        Users user = (Users)session.load(Users.class, id);
        //user.setActivatedDate(currentUser.getActivatedDate());
        return user;
	}

}
