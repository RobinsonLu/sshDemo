package cn.haohaowo.hibernate.user;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users2")
public class User2 implements Serializable {

	private static final long serialVersionUID = -1316843628187767566L;
	
	private Integer id;
	private String firstname;
	private String lastname;
	private Address shippingaddress;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="first_name")
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Column(name="last_name")
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="shipping_address_id",unique=true)
	public Address getShippingaddress() {
		return shippingaddress;
	}
	public void setShippingaddress(Address shippingaddress) {
		this.shippingaddress = shippingaddress;
	}
	
	
}
