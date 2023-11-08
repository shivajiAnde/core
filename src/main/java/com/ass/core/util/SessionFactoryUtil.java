package com.ass.core.util;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ass.core.entity.UserEntity;

public class SessionFactoryUtil {
	
	private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			Configuration cfg=new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getDBConnections());
			cfg.addAnnotatedClass(UserEntity.class);
			sessionFactory=cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
}
