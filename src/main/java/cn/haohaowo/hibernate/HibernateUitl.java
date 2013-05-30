package cn.haohaowo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUitl {

	private static final SessionFactory sessionfactory = 
		new AnnotationConfiguration().configure().buildSessionFactory();
	
	public static Session getSession(){
		return sessionfactory.getCurrentSession();
	}
	public static void close(){
		Session session = sessionfactory.getCurrentSession();
		session.close();
	}
}
