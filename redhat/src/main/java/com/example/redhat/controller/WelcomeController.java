/**
 * 
 */
package com.example.redhat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lokesh.deenadayalan
 * @version 1.0
 * @category @since Mar 15, 2022
 */
@RestController
@RequestMapping("/")
public class WelcomeController {

	@RequestMapping("/hello")
	public String welcome() {
		return "Welcome User!!";
	}
}
