/**
 * 
 */
package com.tofek.auth.LoginAndRegister.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tofek.auth.LoginAndRegister.service.AuthenticationService;

/**
 * @author tkhan26
 *
 */

@RestController
public class AuthenticationController {
	
	//@Autowired
	AuthenticationService authenticationService = new  AuthenticationService();
	
	@GetMapping("/login/{userName}")
	public void validateUserCredential(@PathParam("userName") String userName) {
		System.out.println("inside the Authentication Controller-----");
		boolean result = authenticationService.validateUserCredential(userName);
	}

}
