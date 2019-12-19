package com.bridgelabz.designpatternsown.prototype;
import java.util.ArrayList;
import java.util.List;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:BookShop Implements Cloneable
 * 
 ****************************************************************************************/
public class BookShop implements Cloneable {
	private String ShopName;
	private List<Book> books = new ArrayList<>();

	public String getShopName() {
		return ShopName;
	}

	public void setShopName(String shopName) {
		ShopName = shopName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void loadData() {
		for (int i = 1; i <= 10; i++) {
			Book b = new Book();
			b.setBookId(i);
			b.setBookName("Book" + i);
			getBooks().add(b);
		}
	}

	@Override
	public String toString() {
		return "BookShop [ShopName=" + ShopName + ",\n\t  Books=" + books + "]";
	}

	
	public  BookShop clone() throws CloneNotSupportedException
	{
		BookShop shop=new BookShop();
		for(Book b:this.getBooks())
		{
			shop.getBooks().add(b);
		}
		return shop;
	}

	
}
