package cn.haohaowo.test;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = new AnnotationConfiguration().configure().
		buildSessionFactory().openSession();
		

	}

}
