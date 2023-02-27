package org;

public class Answer {
	
	int aid;
	String aname;
	
	
	
	public Answer(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}



	public void display()
	{
		System.out.println(aid+" "+aname);
	}
}
