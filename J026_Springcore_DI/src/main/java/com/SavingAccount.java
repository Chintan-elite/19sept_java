package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("saving")
public class SavingAccount implements Bank{
		
	@Autowired
	UsertInfo userinInfo;
	
	
	public void getBalance()
	{
		System.out.println("Saving account balance...");
		userinInfo.personalInfo();
	}
}
