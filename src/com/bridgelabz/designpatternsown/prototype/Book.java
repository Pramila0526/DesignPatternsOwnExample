package com.bridgelabz.designpatternsown.prototype;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Book Class
 * 
 ****************************************************************************************/
public class Book 
{
	private int bookId;
	private String bookName;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [BookId=" + bookId + ", BookName=" + bookName + "]";
	}
}
