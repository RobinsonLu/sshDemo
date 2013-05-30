package cn.haohaowo.ch11;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class BookConfirmActionMap extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5027831727246088028L;
	
	private Map<String, Book> books;

	public Map<String, Book> getBooks() {
		return books;
	}

	public void setBooks(Map<String, Book> books) {
		this.books = books;
	}
	
	

}
