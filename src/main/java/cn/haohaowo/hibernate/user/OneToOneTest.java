package cn.haohaowo.hibernate.user;

import org.junit.Test;

import cn.haohaowo.hibernate.BaseCase;

public class OneToOneTest extends BaseCase{
	
	private static Integer tempid;
	
	@Test
	public void testCreate(){
		User2 user21 = new User2();
		user21.setFirstname("wancai");
		user21.setLastname("lu");
		Address address = new Address();
		address.setStreet("renmin");
		
//		user21.setShippingaddress(address);
//		user21.setShippingaddress(address);
//		address.setUser(user21);

		session.beginTransaction();
		session.save(user21);
		session.save(address);
		session.getTransaction().commit();
		tempid = user21.getId();
	}
	
//	@Test
	public void testRead(){
		User2 user22 = (User2) session.load(User2.class, 2);
		System.out.println(user22.getShippingaddress().getStreet());
//		assertNotNull(user22.getShippingaddress());
//		assertEquals("renmin",user22.getShippingaddress().getStreet());
	}

//	@Test
	public void testUpdate(){
		session.beginTransaction();
		User2 user23 = (User2) session.load(User2.class, tempid);
		user23.setFirstname("datong");
		user23.getShippingaddress().setStreet("dongfang");
		session.update(user23);
		session.getTransaction().commit();
	}
	
//	@Test
	public void testDelete(){
		session.beginTransaction();
		User2 user24 = (User2) session.load(User2.class, tempid);
		session.delete(user24);
		session.getTransaction().commit();
	}
}
