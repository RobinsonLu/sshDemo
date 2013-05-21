package cn.haohaowo.hibernate.user;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Item implements Serializable {

	private static final long serialVersionUID = -7682597552038283633L;
	
	private Integer id;
	private String name;
	private String description;
	private BigDecimal initialprice;
	private Set<Bid> bids = new HashSet<Bid>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="name",nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="initial_price")
	public BigDecimal getInitialprice() {
		return initialprice;
	}
	public void setInitialprice(BigDecimal initialprice) {
		this.initialprice = initialprice;
	}
	
	@OneToMany(mappedBy="item")
	public Set<Bid> getBids() {
		return bids;
	}
	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}
	public void add(Bid bid) {
		bids.add(bid);
		
	}
	
}
