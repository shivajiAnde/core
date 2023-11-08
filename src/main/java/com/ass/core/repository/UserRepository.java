package com.ass.core.repository;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ass.core.dto.UserDTO;
import com.ass.core.entity.UserEntity;
import com.ass.core.util.SessionFactoryUtil;


public class UserRepository implements Serializable{
	
	public void saveOrUpdate(UserEntity user) {
		SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(user);
		transaction.commit();
	}
	public UserEntity findById(int id) {
		SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		return session.get(UserEntity.class,id);
	}
	public void update(UserDTO userDTO){
		UserEntity userEntity=findById(userDTO.getAltKey());
		if(userEntity!=null) {
			userEntity.setCourse(userDTO.getCourse());
			userEntity.setFirstName(userDTO.getFirstName());
			userEntity.setLastName(userDTO.getLastName());
			saveOrUpdate(userEntity);
		}
	}
	public void delete(UserDTO userDTO) {
		UserEntity userEntity=findById(userDTO.getAltKey());
		SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(userEntity);
		transaction.commit();
	}
}
