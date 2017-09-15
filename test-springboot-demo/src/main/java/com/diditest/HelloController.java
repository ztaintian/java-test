/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.diditest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	 @RequestMapping("/hello1")
	 public void index(@RequestParam("nameId") String nameId) {
		 System.out.println(nameId);
	 }
}