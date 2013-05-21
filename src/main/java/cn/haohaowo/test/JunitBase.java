package cn.haohaowo.test;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.After;
import org.junit.Before;

public class JunitBase {
	
	protected Session session;
	
	@Before
	public void start() throws Exception{
		session = new AnnotationConfiguration().configure().
		buildSessionFactory().openSession();
	}

	@After
	public void end() throws Exception{
		if(null != session){
			session.close();
		}
	}
}
