package com;

import java.util.List;
import java.util.Set;

public class Student {
	
	int id;
	String name;
	String email;
	List<String> lang;
	Set<String> sub;
	Address adr1;
	
	public Set<String> getSub() {
		return sub;
	}



	public void setSub(Set<String> sub) {
		this.sub = sub;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Address getAdr() {
		return adr1;
	}



	public void setAdr(Address adr1) {
		this.adr1 = adr1;
	}



	public void display()
	{
		System.out.println(id+" "+name+" "+email);
		System.out.println("*******Lang*********");
		for(String l : lang)
		{
			System.out.println(l);
		}
		System.out.println("*******sub********");
		for(String s : sub)
		{
			System.out.println(s);
		}
		adr1.display();
	}



	public List<String> getLang() {
		return lang;
	}



	public void setLang(List<String> lang) {
		this.lang = lang;
	}
	
}
