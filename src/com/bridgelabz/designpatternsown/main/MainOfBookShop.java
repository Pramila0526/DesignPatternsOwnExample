package com.bridgelabz.designpatternsown.main;
import com.bridgelabz.designpatternsown.prototype.BookShop;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:BookShop Class
 * 
 ****************************************************************************************/
public class MainOfBookShop {
	public static void main(String[] args) {
		BookShop bs = new BookShop();
		bs.setShopName("Books House");
		bs.loadData();
		System.out.println(bs);

		BookShop bs1 = new BookShop(); // This is the SImple and expensive way
										// It requires a lot of time because again
										// we are fetching the same data from the database
		bs1.setShopName("Books Bazzar");
		bs1.loadData();
		System.out.println(bs1);
	}
}
