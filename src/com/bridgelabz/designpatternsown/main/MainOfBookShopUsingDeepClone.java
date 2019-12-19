package com.bridgelabz.designpatternsown.main;
import com.bridgelabz.designpatternsown.prototype.BookShop;

public class MainOfBookShopUsingDeepClone {
public static void main(String[] args) throws CloneNotSupportedException {
	BookShop bs=new BookShop();
	bs.setShopName("Books House");
	bs.loadData();
	    
	BookShop bs1= bs.clone(); //This is Deep Cloning
	bs.getBooks().remove(3);  //Remove or add after cloning otherwise it will affect others data
	bs1.setShopName("Books House");
	
	System.out.println(bs);   // Print at the end
	System.out.println(bs1);
	
}
}
