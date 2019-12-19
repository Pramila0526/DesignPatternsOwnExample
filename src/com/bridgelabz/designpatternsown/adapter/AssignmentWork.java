package com.bridgelabz.designpatternsown.adapter;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Assignment work for Adapter
 * 
 ****************************************************************************************/
public class AssignmentWork {
	private Pen pen;
	
	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public void writeAssignment(String str)
	{
		pen.write(str);
	}

}
