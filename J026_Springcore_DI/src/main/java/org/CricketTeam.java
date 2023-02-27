package org;

import org.springframework.stereotype.Component;

@Component("cricket")
public class CricketTeam implements Sports {

	public void team() {
		
		System.out.println("there are 11 team members in cricket team");
		
	}

}
