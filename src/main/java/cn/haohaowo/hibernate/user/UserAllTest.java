package cn.haohaowo.hibernate.user;



import org.junit.Assert;
import org.junit.Test;

import cn.haohaowo.hibernate.BaseCase;

public class UserAllTest extends BaseCase
{
	private static Integer tempid;
	
	
	@Test
	public void testInsert()
	{
		User1 user = new User1();
		user.setName("lwc");
		user.setAge(18);
		
		session.save(user);
		tempid = user.getId();
		Assert.assertNotNull(user.getId());
	}
//	@Test
	public void testSelect()
	{
		User1 user = (User1)session.load(User1.class, tempid);
		//System.out.println(user.getName());
		//System.out.println(user.getAge());
		Assert.assertEquals("lwc", user.getName());
		//Assert.assertEquals(new Integer(20), user.getAge());
		
	}
	
//	@Test
	public void testUpdate()
	{
		User1 user = (User1) session.load(User1.class, tempid);
		user.setAge(20);
		user.setName("NOT");
		//session.update(user);
	}
//	@Test
	public void testDetele()
	{
		User1 user = (User1) session.load(User1.class, tempid);
		session.delete(user);
	}
}
