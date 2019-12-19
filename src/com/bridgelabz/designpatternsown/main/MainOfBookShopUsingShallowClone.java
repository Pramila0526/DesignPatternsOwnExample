package com.bridgelabz.designpatternsown.main;
import com.bridgelabz.designpatternsown.prototype.BookShop;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Main of BookShop Using Shallow Cloning
 * 
 ****************************************************************************************/
public class MainOfBookShopUsingShallowClone {
public static void main(String[] args) throws CloneNotSupportedException {
	BookShop bs=new BookShop();
	bs.setShopName("Books House");
	bs.loadData();
	bs.getBooks().remove(3);    //here we are removing data 4 but because of shallow cleaning
								// It is also removing it from the other side and it is not the right way
								// of Cloning.So use Deep Cloning
	System.out.println(bs);
	
	BookShop bs1=(BookShop) bs.clone();  //This is Shallow Cloning
	bs1.setShopName("Books House");
	System.out.println(bs1);
	
}
}
