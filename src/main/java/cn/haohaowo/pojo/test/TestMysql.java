package cn.haohaowo.pojo.test;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

import cn.haohaowo.hibernate.BaseCase;
import cn.haohaowo.pojo.EcNew;
import cn.haohaowo.pojo.Picture;
import cn.haohaowo.pojo.SportNew;

public class TestMysql extends BaseCase{

//	@Test
	public void createDB(){
		
		SchemaExport export = new SchemaExport(new AnnotationConfiguration().configure());
		//first 打印在控制台  second 生成表
		export.create(true, false);
		session.beginTransaction().commit();
	}
	
//	@Test
	public void create(){
		Picture picture = new Picture();
		picture.setName("bbb");
		session.save(picture);
		session.clear();
		session.beginTransaction().commit();
	}
	
//	@Test
	public void read(){
		Picture picture = (Picture) session.load(Picture.class, 1);
		System.out.println(picture.getName());
	}
	
	
//	@Test
	public void update(){
		Picture picture = (Picture) session.load(Picture.class, 3);
		picture.setName("cc");
		session.saveOrUpdate(picture);
		session.clear();
		session.beginTransaction().commit();
	}
	
//	@Test
	public void merge(){
		Picture picture = (Picture) session.load(Picture.class, 1);
		
		Picture picture2 = new Picture("dd","dd","dd");
		picture2.setId(2);
		session.merge(picture2);
		session.clear();
		session.beginTransaction().commit();
	}
	
//	@Test
	public void flush(){
		Picture picture = (Picture) session.load(Picture.class, 1);
		
		picture.setUrl("xxx");
		session.flush();
		picture.setUrl("oooo");
		session.clear();
		session.beginTransaction().commit();
	}
	
//	@Test
	public void initdata(){
		for(int i=0;i<10000;i++){
			Picture picture = new Picture("name"+System.nanoTime()+"@"+ new Random().nextInt(10),
					"owner@"+new Random().nextInt(100),"aaaaaa");
			session.save(picture);
		}
		session.beginTransaction().commit();
	}
	
//	@Test
	public void testHQL(){
		String hql = "from Picture p where p.owner like :last";
		
		List<Picture> pictures = session.createQuery(hql).setString("last", "%@45%").list();
		
		System.out.println("---------------------- size --"+pictures.size());
	}
	
//	@Test
	public void updatePic(){
		for(int i=1000;i<2000;i++){
			Picture picture = (Picture)session.load(Picture.class, i);
			picture.setStory("owner:"+picture.getName()+":story");
			picture.setCreatedate(new Date("2010/7/8"));
			picture.setLastupdatedate(new Date());
		}
//		session.beginTransaction().commit();
	}
	
	@Test
	public void testInheritance(){
		SportNew snews = new SportNew();
		snews.setAuthor("szhu");
		snews.setMessage("got a job");
		snews.setTeacher("oooxx");
		snews.setTeam("xxxoo");
		
		session.saveOrUpdate(snews);
		
		EcNew enews = new EcNew();
		enews.setAuthor("szhu");
		enews.setMessage("got a job");
		enews.setTitle("gdp got a growth of 8%");
		enews.setGrowth(0.08f);
		
		session.saveOrUpdate(enews);
		
		session.beginTransaction().commit();
	}
}
