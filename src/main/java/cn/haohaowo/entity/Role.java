package cn.haohaowo.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "roles")
public class Role implements java.io.Serializable {

	private static final long serialVersionUID = -195000782575119737L;
	private String name;
	private Set<FunctionRole> functions = new HashSet<FunctionRole>(0);
	private Set<UserRole> users = new HashSet<UserRole>(0);
	
	private Integer id;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 25)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "role")
	public Set<FunctionRole> getFunctions() {
		return this.functions;
	}

	public void setFunctions(Set<FunctionRole> functions) {
		this.functions = functions;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "role")
	public Set<UserRole> getUsers() {
		return this.users;
	}

	public void setUsers(Set<UserRole> users) {
		this.users = users;
	}

}