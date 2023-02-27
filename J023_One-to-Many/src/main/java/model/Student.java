package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int stid;
	String stname;
	
	@ManyToMany
	@JoinTable(
			name="std_sub",
			joinColumns = @JoinColumn(name="stid"),
			inverseJoinColumns = @JoinColumn(name="subid")	
			)
	List<Subject> sub;

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public List<Subject> getSub() {
		return sub;
	}

	public void setSub(List<Subject> sub) {
		this.sub = sub;
	}
	
	public void addSubject(Subject s)
	{
		if(sub==null)
		{
			sub = new ArrayList<Subject>();
		}
		sub.add(s);
	}
	
	
}
