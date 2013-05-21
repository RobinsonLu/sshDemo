package cn.haohaowo.hibernate.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Test;

import cn.haohaowo.hibernate.BaseCase;

public class ManyToOneTest extends BaseCase{

	private static Integer tempid;
	
	@Test
	public void testCreate(){
		
		Item item = new Item();
		item.setName("book");
		item.setInitialprice(new BigDecimal(909.90));
//		session.beginTransaction();
//		session.save(item);
//		item = (Item)session.load(Item.class, 1);
		
		Bid bid1 = new Bid();
		bid1.setAmount(new BigDecimal(100.09));
		bid1.setItem(item);
		
		Bid bid2 = new Bid();
		bid2.setAmount(new BigDecimal(1000.98));
		bid2.setItem(item);
		
		bid1.setItem(item);
		bid2.setItem(item);
		
		
		session.beginTransaction();
		session.save(item);
		session.save(bid1);
		session.save(bid2);
		session.getTransaction().commit();
		tempid = item.getId();
		
	}
	
//	@Test
	public void testRead(){
		Item item = (Item) session.load(Item.class, tempid);
//		assertNotNull(item.getBids());
//		assertEquals(2,item.getBids().size());
	}
	
//	@Test
	public void testUpdate(){
		session.beginTransaction();
		Item item = (Item) session.load(Item.class, tempid);
		item.setName("Food");
		Bid bid = new Bid();
		bid.setAmount(new BigDecimal(22.09));
//		item.add(bid);
//		bid.setItem(item);
//		session.save(bid);
		session.getTransaction().commit();
	}
	
//	@Test
	public void testDelete(){
		session.beginTransaction();
		Item item = (Item) session.load(Item.class, tempid);
		session.delete(item);
		session.getTransaction().commit();
	}
}
