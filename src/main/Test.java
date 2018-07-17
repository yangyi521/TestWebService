/**
 * 
 */
package main;

import org.ccnt.jax.web.client.ServiceService;

import bean.User;

/**
* Filename:    Test.java
* @author:     yyi
* @version:    1.0
* @date:   2018Äê7ÔÂ17ÈÕ
* @Description:
 */
public class Test {
	public static void main(String[] args) {
		ServiceService helloDemoService  = new ServiceService();
		org.ccnt.jax.web.client.User user = helloDemoService.getServicePort().testSelectUserById(1);
		
		System.out.println(user.getPassWord());
		System.out.println(user.getEMail());
		System.out.println(user.getUserName());
		System.out.println(user.getEMail());
		System.out.println(user.getPassWord());
		
	}

}
