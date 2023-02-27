package com;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount  implements Bank{

	public void getBalance() {
		
		System.out.println("Current account calling..");
		
	}

}
