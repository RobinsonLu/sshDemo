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
 * Function entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "functions")
public class Function implements java.io.Serializable {
	private static final long serialVersionUID = -4230624175074569312L;
	private Integer id;
	private String name;
	private Set<FunctionRole> roles = new HashSet<FunctionRole>(0);
	private Set<Url> urls = new HashSet<Url>(0);

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "role")
	public Set<FunctionRole> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<FunctionRole> roles) {
		this.roles = roles;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "function")
	public Set<Url> getUrls() {
		return this.urls;
	}

	public void setUrls(Set<Url> urls) {
		this.urls = urls;
	}

}