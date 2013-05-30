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
		
		//打开事务
		Transaction ta = session.beginTransaction();
		//保存
		session.save(user);
		//提交
		ta.commit();
		System.out.println(user.getId());
		
		//关闭session
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
		//加载配置文件 Hibernate.cfg.xml
		Configuration config = new AnnotationConfiguration().configure();
		//创建sessionFactory
		SessionFactory sessionfactory = config.buildSessionFactory();
		//获取session
		Session session = sessionfactory.openSession();
		
		return session;
	}
}
