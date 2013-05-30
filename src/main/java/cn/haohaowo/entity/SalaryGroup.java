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
 * SalaryGroup entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "salary_groups")
public class SalaryGroup implements java.io.Serializable {
	private static final long serialVersionUID = 6591010291335533650L;
	private Integer id;
	private String level;
	private Double base;
	private Double bonus;
	private Double other;
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

	@Column(name = "level", length = 2)
	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Column(name = "base", precision = 10)
	public Double getBase() {
		return this.base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	@Column(name = "bonus", precision = 10)
	public Double getBonus() {
		return this.bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	@Column(name = "other", precision = 10)
	public Double getOther() {
		return this.other;
	}

	public void setOther(Double other) {
		this.other = other;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "salaryGroup")
	public Set<Associate> getAssociates() {
		return this.associates;
	}

	public void setAssociates(Set<Associate> associates) {
		this.associates = associates;
	}

}