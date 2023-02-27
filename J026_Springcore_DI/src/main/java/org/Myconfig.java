package org;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.PrimeUser;
import com.UsertInfo;

@Configuration
@ComponentScan("org")
public class Myconfig {
	@Bean
	public UsertInfo getinfo()
	{
		return new PrimeUser();
	}
}
