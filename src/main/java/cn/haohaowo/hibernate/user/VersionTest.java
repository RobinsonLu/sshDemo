package cn.haohaowo.hibernate.user;


import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;
import org.junit.Test;

import cn.haohaowo.hibernate.BaseCase;

public class VersionTest extends BaseCase{

	private static Integer tempid;
	
	@Test
	public void testCreate(){
		User3 user31 = new User3();
		user31.setName("luwancai");
		
		session.beginTransaction();
		session.save(user31);
		session.getTransaction().commit();
		
		assertEquals(new Integer(0),user31.getVersion());
		tempid = user31.getId();
	}
	
	@Test
	public void testUpdate(){
		session.beginTransaction();
		
		User3 user32 = (User3) session.load(User3.class, tempid);
		assertEquals(new Integer(0), user32.getVersion());
		user32.setName("jack");
		
		session.getTransaction().commit();
		assertEquals(new Integer(1), user32.getVersion());
	}
	
	@Test(expected=StaleObjectStateException.class)
	public void testStaleVersion(){
		
		session.beginTransaction();
		User3 user33 = (User3) session.load(User3.class, tempid);
		user33.setName("xxxx");
		
		//another transation
		/*
		Session session2 = this.sessionfactory.openSession();
		session2.beginTransaction();
		User3 user34 = (User3) session2.load(User3.class, tempid);
		user34.setName("yyyyy");
		session2.getTransaction().commit();
		session2.close();
		*/
		session.getTransaction().commit();
	}
}
