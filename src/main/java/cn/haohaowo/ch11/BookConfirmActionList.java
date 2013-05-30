package cn.haohaowo.ch11;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class BookConfirmActionList extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -764985119946416054L;
	
	private List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
