package cn.haohaowo.hibernate.user;

import java.util.List;

import org.hibernate.Query;
import org.junit.Test;

import cn.haohaowo.hibernate.BaseCase;

public class HQLTest extends BaseCase {

//	@Test
	public void testEntityQuery(){
		
		String hql = "from User";
		hql = "from User u where u.name='luwancai163'";
		Query query = session.createQuery(hql);
		List<User1> users = query.list();
		
		System.out.println(users.size());
		
		for(User1 user:users){
			System.out.printf("User id:%d , name:%s",user.getId(),user.getName());
		}
	}
	
//	@Test
	public void testPropertyQuery(){
		//single property
		String hql = "select u.name from User u";
		List<String> names = session.createQuery(hql).list();
		for(String name:names){
			System.out.println("User name :"+name);
		}
		
		hql = "select u.name,u.age from User u";
		List<Object[]> rows = session.createQuery(hql).list();
		for(Object[] row:rows){
			String name = (String) row[0];
			Integer age = (Integer) row[1];
			System.out.printf("User name:%s , age : %d\n", name,age);
		}
		
		hql = "select new User(u.name,u.age) from User u";
		List<User1> users = session.createQuery(hql).list();
		for(User1 user:users){
			System.out.printf("User id:%d , name:%s \n",user.getId(),user.getName());
		}
		
		hql = "select count(*) from User";
		Long count = (Long) session.createQuery(hql).uniqueResult();
		System.out.println("count is :"+count);
		
		hql = "select distinct(u.name) as name from User u";
		names = session.createQuery(hql).list();
		for(String name:names){
			System.out.println("User name :"+name);
		}
		
		hql = "from User u where lower(u.name) like '%u%'";
		users = session.createQuery(hql).list();
		for(User1 user:users){
			System.out.printf("User id:%d , name:%s \n",user.getId(),user.getName());
		}
	}
	
//	@Test
	public void testBindingParameters(){
		//positional parameters
		
		String hql = "from User u where u.name = ? and u.age = ?";
		List<User1> users = session.createQuery(hql).setString(0, "luwancai163")
						   .setInteger(1, 22).list();
		for(User1 user:users){
			System.out.printf("User id:%d , name:%s \n",user.getId(),user.getName());
		}
		
		hql = "from User u where u.name = :name and u.age = :age";
		users = session.createQuery(hql).setString("name", "luwancai163")
				.setInteger("age", 22).list();
		for(User1 user:users){
			System.out.printf("User id:%d , name:%s \n",user.getId(),user.getName());
		}
		users = session.createQuery(hql).setParameter("name", "luwancai163")
				.setParameter("age", 22).list();
		for(User1 user:users){
			System.out.printf("User id:%d , name:%s \n",user.getId(),user.getName());
		}
		
	}
	
//	@Test
	public void testManyObject(){
		String hql = "from Item i , Bid b where i.id = b.item.id";
		List<Object[]> rows = session.createQuery(hql).list();
		for(Object[] row:rows){
			Item item = (Item)row[0];
			Bid bid = (Bid)row[1];
			
			System.out.printf("Item id:%d , name is : %s\n", item.getId(),item.getName());
			System.out.printf("Bid id:%d , amount is : %s\n", bid.getId(),bid.getAmount());
			
		}
	}
	
//	@Test
	public void testFetchAssionciation(){
		String hql = "from Bid b where b.item.description like :desc";
		List<Bid> bids = session.createQuery(hql).setString("desc", "%d%").list();
		for(Bid bid:bids){
			System.out.printf("Bid id:%d , amount is : %s\n", bid.getId(),bid.getAmount());
		}
	}
//	@Test
	public void testBlukUpdate(){
		String hql = "update User u set u.name = :name where u.id = :id";
		session.beginTransaction();
		session.createQuery(hql).setString("name", "Robinson")
		.setInteger("id", 2).executeUpdate();
		session.getTransaction().commit();
	}
//	@Test
	public void testBlukDelete(){
		String hql = "delete User u where u.id = :id";
		session.beginTransaction();
		session.createQuery(hql).setInteger("id", 3).executeUpdate();
		session.getTransaction().commit();
	}
	
	@Test
	public void testSql(){
		List<Object[]> users = session.createSQLQuery("select * from users").list();
		for(Object[] user:users){
			Integer id = (Integer) user[0];
			String name = (String) user[1];
			
			System.out.printf("User id is :%d , name is : %s\n",id,name);
		}
		System.out.println("----------------------");
		users = session.createSQLQuery("select * from users where id > 3").list();
		for(Object[] user:users){
			Integer id = (Integer) user[0];
			String name = (String) user[1];
			
			System.out.printf("User id is :%d , name is : %s\n",id,name);
		}
	}
	
//	@Test
	public void testNativeSQL(){
		String sql = "select id as {u.id} , name as {u.name} , age as {u.age} " +
				"from user1 u";
		List<User1> users = session.createSQLQuery(sql).addEntity("u",User1.class).list();
		for(User1 user:users){
			System.out.printf("id=%d , name=%s , age=%d\n", user.getId(),user.getName(),user.getAge());
		}
		
		sql = "select b.* , i.* from bids  b, items i where b.item_id = i.id";
		List<Object[]> rows = session.createSQLQuery(sql).addEntity("b",Bid.class).addEntity("i",Item.class).list();
		for(Object[] row:rows){
			Bid bid = (Bid)row[0];
			System.out.printf("id:%d,amount:%f,item_id:%d\n",bid.getId(),bid.getAmount(),bid.getItem().getId());
		}
	}
}
