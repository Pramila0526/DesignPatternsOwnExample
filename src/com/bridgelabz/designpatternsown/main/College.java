package com.bridgelabz.designpatternsown.main;
import com.bridgelabz.designpatternsown.adapter.AssignmentWork;
import com.bridgelabz.designpatternsown.adapter.Pen;
import com.bridgelabz.designpatternsown.adapter.PenAdapter;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Main Of College Class
 * 
 ****************************************************************************************/
public class College
{
	public static void main(String[] args) 
	{
		Pen p=new PenAdapter();
	//	PilotPen pp=new PilotPen();
		AssignmentWork aw=new AssignmentWork();
		
	//	aw.writeAssignment("Assignments"); Null Pointer Exception because we  are 
											//not assigned memory to p
	//	aw.setPen(pp);  Error because example-Samsung charger cannot connect to iphone 
		
		aw.setPen(p);
		aw.writeAssignment("There are too many Assignments");
		
	}
}