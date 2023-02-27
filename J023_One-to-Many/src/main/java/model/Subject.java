package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int subid;
	String subname;
	
	@ManyToMany
	@JoinTable(
			name="std_sub",
			joinColumns = @JoinColumn(name="subid"),
			inverseJoinColumns = @JoinColumn(name="stid")	
			)
	List<Student> std;

	public int getSubid() {
		return subid;
	}

	public void setSubid(int subid) {
		this.subid = subid;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public List<Student> getStd() {
		return std;
	}

	public void setStd(List<Student> std) {
		this.std = std;
	}
	
	public void addStudent(Student s)
	{
		if(std==null)
		{
			std = new ArrayList<Student>();
		}
		std.add(s);
	}
	
}
