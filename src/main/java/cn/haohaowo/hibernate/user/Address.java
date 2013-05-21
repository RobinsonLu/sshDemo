package cn.haohaowo.hibernate.user;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="addresses")
public class Address implements Serializable {

	private static final long serialVersionUID = -4998783263448838910L;
	
	private Integer id;
	private String street;
	private String zipcode;
	private String city;
	
	private User2 user;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@OneToOne(mappedBy="shippingaddress", cascade=CascadeType.ALL)
	public User2 getUser() {
		return user;
	}

	public void setUser(User2 user) {
		this.user = user;
	}
}
