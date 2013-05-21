package cn.haohaowo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Salary entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "salaries")
public class Salary implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -7564514541580081035L;
	private Integer id;
	private Associate associate;
	private String month;
	private Double base;
	private Double bonus;
	private Double other;

	// Constructors

	/** default constructor */
	public Salary() {
	}

	/** full constructor */
	public Salary(Associate associate, String month, Double base, Double bonus,
			Double other) {
		this.associate = associate;
		this.month = month;
		this.base = base;
		this.bonus = bonus;
		this.other = other;
	}

	// Property accessors
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
	@JoinColumn(name = "associate_id")
	public Associate getAssociate() {
		return this.associate;
	}

	public void setAssociate(Associate associate) {
		this.associate = associate;
	}

	@Column(name = "month", length = 10)
	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
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

}