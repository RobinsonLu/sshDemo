package cn.haohaowo.hibernate.user;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class UserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		insert();
//		select();
//		delete();
//		update();
		
	}
	
	public static void insert()
	{
		Session session = getSession();
		User1 user = new User1();
		user.setName("luwancai163");
		user.setAge(22);
		
		//������
		Transaction ta = session.beginTransaction();
		//����
		session.save(user);
		//�ύ
		ta.commit();
		System.out.println(user.getId());
		
		//�ر�session
		session.close();
	}
	
	public static void select()
	{
		Session session = getSession();
		User1 user = (User1)session.load(User1.class, 1);
		System.out.println(user.getName());
		System.out.println(user.getAge());
		session.close();
	}
	
	public static void delete()
	{
		Session session = getSession();
		Transaction ta = session.beginTransaction();
		User1 user = (User1) session.load(User1.class, 1);
		session.delete(user);
		ta.commit();
		session.close();
	}
	
	public static void update()
	{
		Session session = getSession();
		Transaction ta = session.beginTransaction();
		User1 user = (User1) session.load(User1.class, 2);
		user.setAge(2);
		user.setName("root");
		session.update(user);
		ta.commit();
		session.close();
	}
	
	@SuppressWarnings("deprecation")
	public static  Session getSession()
	{
		//���������ļ� Hibernate.cfg.xml
		Configuration config = new AnnotationConfiguration().configure();
		//����sessionFactory
		SessionFactory sessionfactory = config.buildSessionFactory();
		//��ȡsession
		Session session = sessionfactory.openSession();
		
		return session;
	}
}
