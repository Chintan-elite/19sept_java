package org;

import java.util.List;

public class Questions {
	
	int qid;
	String qname;
	List<Answer> ans;
	
	
	



	public Questions(int qid, String qname, List<Answer> ans) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.ans = ans;
	}






	public void display()
	{
		System.out.println(qid+" "+qname);
		for(Answer a:  ans)
		{
			a.display();
		}
	}
}
