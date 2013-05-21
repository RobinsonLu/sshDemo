package cn.haohaowo.ch11;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class BookConfirmActionListLower5 extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7461970299952491794L;
	
	private List books;

	public List getBooks() {
		return books;
	}

	public void setBooks(List books) {
		this.books = books;
	}
	
	

}