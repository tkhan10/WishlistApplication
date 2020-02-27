/**
 * 
 */
package com.tofek.auth.LoginAndRegister.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author tkhan26
 *
 */

@Service
public class AuthenticationService {
	
	//@Autowired
	private RestTemplate restTemplate = new RestTemplate();

	public boolean validateUserCredential(String userName) {
		
		System.out.println("Inside Validate user ");
		return restTemplate.getForObject("http://localhost:8091/validateUser/"+userName, Boolean.class);
		
	}

}
