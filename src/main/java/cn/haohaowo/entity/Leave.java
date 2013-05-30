package cn.haohaowo.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Leave entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "leaves")
public class Leave implements java.io.Serializable {
	private static final long serialVersionUID = 1963367479484147688L;
	private Integer id;
	private Associate associateByAssociateId;
	private Associate associateByManageId;
	private String reason;
	private Date begin;
	private Date end;
	private String status;
	private String result;
	private Date passDate;

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
	public Associate getAssociateByAssociateId() {
		return this.associateByAssociateId;
	}

	public void setAssociateByAssociateId(Associate associateByAssociateId) {
		this.associateByAssociateId = associateByAssociateId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "manage_id")
	public Associate getAssociateByManageId() {
		return this.associateByManageId;
	}

	public void setAssociateByManageId(Associate associateByManageId) {
		this.associateByManageId = associateByManageId;
	}

	@Column(name = "reason", length = 65535)
	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "begin", length = 0)
	public Date getBegin() {
		return this.begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "end", length = 0)
	public Date getEnd() {
		return this.end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	@Column(name = "status", length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "result", length = 65535)
	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "pass_date", length = 0)
	public Date getPassDate() {
		return this.passDate;
	}

	public void setPassDate(Date passDate) {
		this.passDate = passDate;
	}

}