package cn.haohaowo.test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;



import org.junit.Test;

import cn.haohaowo.entity.Account;
import cn.haohaowo.entity.Associate;
import cn.haohaowo.entity.Department;
import cn.haohaowo.entity.Function;
import cn.haohaowo.entity.InfoUpdate;
import cn.haohaowo.entity.Leave;
import cn.haohaowo.entity.Role;
import cn.haohaowo.entity.Salary;
import cn.haohaowo.entity.SalaryGroup;
import cn.haohaowo.entity.Url;
import cn.haohaowo.entity.User;


public class TestJunit  extends JunitBase{

	@Test
	public void TestAssociate(){
		
		Calendar cal = Calendar.getInstance();
		cal.set(1987,7,06);
		session.beginTransaction();
		Associate associate = new Associate();
		associate.setAddress("china");
		associate.setBirthday(cal.getTime());
		associate.setEmail("jimjaa@chinahr.com");
		associate.setIdNumber("1234567");
		associate.setName("jimjaa");
		associate.setPhone("123456789");
		associate.setType("2");
		associate.setStatus("1");
		session.saveOrUpdate(associate);
		session.getTransaction().commit();
		
		
		
//		assertNull(user.getName());
	}
	
//	@Test
	public void TestAccount(){
		Account account = new Account();
		account.setNo("1234567890");
		account.setStatus("1");
		session.beginTransaction();
		Associate associate = (Associate)session.load(Associate.class, 1);
		account.setAssociate(associate);
		session.saveOrUpdate(account);
		session.getTransaction().commit();
	}
	
	
//	@Test
	public void TestDepartment(){
		Department department = new Department();
		department.setName("IT");
		Set<Associate> associates = new HashSet<Associate>();
		Associate associate = (Associate)session.load(Associate.class, 1);
		associates.add(associate);
		department.setAssociates(associates);
		session.beginTransaction();
		session.saveOrUpdate(department);
		session.getTransaction().commit();
	}
	
//	@Test
	public void TestLeave(){
		Leave leave = new Leave();
		
		leave.setAssociateByAssociateId((Associate)session.load(Associate.class, 2));
		leave.setAssociateByManageId((Associate)session.load(Associate.class, 1));
		leave.setBegin(new Date());
		leave.setEnd(new Date());
		leave.setPassDate(new Date());
		leave.setReason("no");
		leave.setResult("ok");
		leave.setStatus("1");
		session.beginTransaction();
		session.saveOrUpdate(leave);
		session.getTransaction().commit();
	}
	
//	@Test
	public void TestSalary(){
		Salary salary = new Salary();
		salary.setAssociate((Associate)session.load(Associate.class, 1));
		salary.setBase(3000.01);
		salary.setBonus(1000.09);
		salary.setMonth("201009");
		salary.setOther(2000.90);
		session.beginTransaction();
		session.saveOrUpdate(salary);
		session.getTransaction().commit();
		
	}
	
	
//	@Test
	public void TestSalaryGroup(){
		SalaryGroup salarygroup = new SalaryGroup();
		Set<Associate> associates = new HashSet<Associate>();
		associates.add((Associate)session.load(Associate.class, 1));
		salarygroup.setAssociates(associates);
		salarygroup.setBase(3000.00);
		salarygroup.setBonus(1000.00);
		salarygroup.setOther(1000.00);
		salarygroup.setLevel("1");
		session.beginTransaction();
		session.saveOrUpdate(salarygroup);
		session.getTransaction().commit();
		
	}
	
//	@Test
	public void TestInfoUpdate(){
		InfoUpdate infoupdate = new InfoUpdate();
		infoupdate.setAssociateByAssociateId((Associate)session.load(Associate.class, 2));
		infoupdate.setAssociateByHrId((Associate)session.load(Associate.class, 1));
		infoupdate.setEmail("china@chinahr.com");
		infoupdate.setAddress("china");
		infoupdate.setPhone("1234567890");
		infoupdate.setStatus("1");
		session.beginTransaction();
		session.saveOrUpdate(infoupdate);
		session.getTransaction().commit();
	}
	
//	@Test
	public void TestUser(){
		User user = new User();
		Associate associate = new Associate();
		user.setAssociate((Associate)session.load(Associate.class, 1));
		user.setName("root1");
		user.setPassword("123456");
		user.setStatus("1");
		session.beginTransaction();
		session.saveOrUpdate(user);
		session.getTransaction().commit();
	}
	
//	@Test
	public void TestRole(){
		Role role = new Role();
		role.setName("FR");
		Set<User> users = new HashSet<User>();
		users.add((User)session.load(User.class, 1));
//		role.setUsers(users);
		session.beginTransaction();
		session.saveOrUpdate(role);
		session.getTransaction().commit();
	}
//	@Test
	public void TestFunction(){
		Function function = new Function();
		function.setName("root");
		Set<Role> roles = new HashSet<Role>();
		roles.add((Role)session.load(Role.class, 1));
//		function.setRoles(roles);
		session.beginTransaction();
		session.saveOrUpdate(function);
		session.getTransaction().commit();
	}
	
//	@Test
	public void TestUrl(){
		Url url = new Url();
		url.setFunction((Function)session.load(Function.class, 1));
		url.setUrl("/admin/list");
		session.beginTransaction();
		session.saveOrUpdate(url);
		session.getTransaction().commit();
	}
	
//	@Test
	public void TestDelAssociate(){
		session.beginTransaction();
		Associate associate = (Associate)session.load(Associate.class, 2);
		session.delete(associate);
		session.getTransaction().commit();
	}
	
//	@Test
	public void TestDelUser(){
		session.beginTransaction();
		User user = (User)session.load(User.class, 1);
		session.delete(user);
		session.getTransaction().commit();
	}
}
