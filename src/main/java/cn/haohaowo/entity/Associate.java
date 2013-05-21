package cn.haohaowo.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Associate entity. @author MyEclipse Persistence Tools
 */
@Entity(name = "cn.haohaowo.entity.Associate")
@Table(name = "associates")
public class Associate implements java.io.Serializable {
	private static final long serialVersionUID = -776066768917188029L;
	private Integer id;
	private Associate associate;
	private SalaryGroup salaryGroup;
	private Department department;
	private String name;
	private Date birthday;
	private String sex;
	private String address;
	private String phone;
	private String email;
	private String status;
	private String idNumber;
	private String type;
	private String asNumber;
	private Set<Leave> leavesForManageId = new HashSet<Leave>(0);
	private Set<Leave> leavesForAssociateId = new HashSet<Leave>(0);
	private Set<InfoUpdate> infoUpdatesForAssociateId = new HashSet<InfoUpdate>(
			0);
	private Set<InfoUpdate> infoUpdatesForHrId = new HashSet<InfoUpdate>(0);
	private Set<Associate> associates = new HashSet<Associate>(0);
	private Account account;
	private User user;
	private Set<Salary> salaries = new HashSet<Salary>(0);
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "manage_id")
	public Associate getAssociate() {
		return this.associate;
	}

	public void setAssociate(Associate associate) {
		this.associate = associate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "salary_group_id")
	public SalaryGroup getSalaryGroup() {
		return this.salaryGroup;
	}

	public void setSalaryGroup(SalaryGroup salaryGroup) {
		this.salaryGroup = salaryGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Column(name = "name", length = 25)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "birthday", length = 0)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "sex", length = 1)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "address", length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "phone", length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "status", length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "id_number", length = 25)
	public String getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@Column(name = "type", length = 10)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "as_number", length = 25)
	public String getAsNumber() {
		return this.asNumber;
	}

	public void setAsNumber(String asNumber) {
		this.asNumber = asNumber;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "associateByManageId")
	public Set<Leave> getLeavesForManageId() {
		return this.leavesForManageId;
	}

	public void setLeavesForManageId(Set<Leave> leavesForManageId) {
		this.leavesForManageId = leavesForManageId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "associateByAssociateId")
	public Set<Leave> getLeavesForAssociateId() {
		return this.leavesForAssociateId;
	}

	public void setLeavesForAssociateId(Set<Leave> leavesForAssociateId) {
		this.leavesForAssociateId = leavesForAssociateId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "associateByAssociateId")
	public Set<InfoUpdate> getInfoUpdatesForAssociateId() {
		return this.infoUpdatesForAssociateId;
	}

	public void setInfoUpdatesForAssociateId(
			Set<InfoUpdate> infoUpdatesForAssociateId) {
		this.infoUpdatesForAssociateId = infoUpdatesForAssociateId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "associateByHrId")
	public Set<InfoUpdate> getInfoUpdatesForHrId() {
		return this.infoUpdatesForHrId;
	}

	public void setInfoUpdatesForHrId(Set<InfoUpdate> infoUpdatesForHrId) {
		this.infoUpdatesForHrId = infoUpdatesForHrId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "associate")
	public Set<Associate> getAssociates() {
		return this.associates;
	}

	public void setAssociates(Set<Associate> associates) {
		this.associates = associates;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "associate")
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "associate")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "associate")
	public Set<Salary> getSalaries() {
		return this.salaries;
	}

	public void setSalaries(Set<Salary> salaries) {
		this.salaries = salaries;
	}

}