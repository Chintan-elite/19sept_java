package org;

import org.springframework.stereotype.Component;

@Component("hockey")
public class HockeyTeam implements Sports {

	public void team() {
		
		System.out.println("there are 11 team members in hockey team");
	}

}
