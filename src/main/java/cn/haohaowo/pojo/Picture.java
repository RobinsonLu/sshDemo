package cn.haohaowo.pojo;

import java.util.Date;

public class Picture {
	
	private Integer id;
	private String name;
	private Date createdate;
	private Date lastupdatedate;
	private String owner;
	private String story;
	private String abstact;
	private String url;
	
	public Picture(){}

	public Picture(String name, String owner, String url) {
		super();
		this.name = name;
		this.owner = owner;
		this.url = url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getLastupdatedate() {
		return lastupdatedate;
	}

	public void setLastupdatedate(Date lastupdatedate) {
		this.lastupdatedate = lastupdatedate;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getAbstact() {
		return abstact;
	}

	public void setAbstact(String abstact) {
		this.abstact = abstact;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
