package cn.haohaowo.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "departments")
public class Department implements java.io.Serializable {
	private static final long serialVersionUID = 7690079697239114071L;
	private Integer id;
	private String name;
	private Set<Associate> associates = new HashSet<Associate>(0);
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "department")
	public Set<Associate> getAssociates() {
		return this.associates;
	}

	public void setAssociates(Set<Associate> associates) {
		this.associates = associates;
	}

}