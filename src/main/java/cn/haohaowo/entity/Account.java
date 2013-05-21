package cn.haohaowo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */
@Entity(name = "cn.haohaowo.entity.Account")
@Table(name = "accounts", uniqueConstraints = @UniqueConstraint(columnNames = "associate_id"))
public class Account implements java.io.Serializable {
	private static final long serialVersionUID = -6202308271947462660L;
	private Integer id;
	private Associate associate;
	private String no;
	private String status;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="associate_id")
	public Associate getAssociate() {
		return this.associate;
	}

	public void setAssociate(Associate associate) {
		this.associate = associate;
	}

	@Column(name = "no", length = 25)
	public String getNo() {
		return this.no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Column(name = "status", length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}