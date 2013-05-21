package cn.haohaowo.hibernate;


import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.After;
import org.junit.Before;

public class BaseCase 
{
//	protected SessionFactory sessionfactory;
	protected Session session;
//	protected Transaction tx;
	
	
	@Before
	public void showup() throws Exception
	{
		session = new AnnotationConfiguration().configure().
		buildSessionFactory().openSession();
//		tx = session.beginTransaction();
	}
	@After
	public void showdown() throws Exception
	{
//		tx.commit();
		if(session != null && session.isOpen())
		{
			session.close();
		}
	}
}
