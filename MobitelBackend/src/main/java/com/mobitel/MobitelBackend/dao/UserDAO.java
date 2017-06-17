package com.mobitel.MobitelBackend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobitel.MobitelBackend.model.User;



@Repository("userDAO")
public class UserDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	
	public  UserDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	
	
	public User getuser(int uid)
	{
		Session session=sessionFactory.openSession();
		User user=(User)session.get(User.class,uid);
		session.close();
		return user;
	}
	
	@Transactional
	public void deleteUser(User user)
	{
		sessionFactory.getCurrentSession().delete(user);
	}
	
	public List<User> getSupplierDetails()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from User");
		List<User> list=query.list();
		session.close();
		return list;
	}
	@Transactional
	public void insertUpdateUser(User user) {
		
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
	}
	
}