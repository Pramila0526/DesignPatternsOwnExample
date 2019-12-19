package com.bridgelabz.designpatternsown.adapter;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Pen Adapter
 * 
 ****************************************************************************************/
public class PenAdapter implements Pen 
{
	PilotPen pp=new PilotPen();
	public void write(String str) {
		pp.mark(str);
		
	}

}
