package com.cmos.eimscore;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * 
 */
public class BaseTest extends TestCase {

	public static ApplicationContext context = new ClassPathXmlApplicationContext(
			"spring/spring-all.xml");

	public void testContext() {
		assertNotNull("ApplicationContext is null!", context);
	}

}
