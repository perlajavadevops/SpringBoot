package com.pgr.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp2 = (Employee) context.getBean("employee");
		emp2.displayEmployee();
		/*Employee emp3 = (Employee) context.getBean("employee");
		//emp3.displayEmployee();
		
		System.out.println("==========Scopes Demo for emp2 started==========");
		System.out.println("Employee hashCode:: == "+emp2.hashCode());
		System.out.println("Address hashCode:: == "+emp2.getAddress().hashCode());
		System.out.println("==========Scopes Demo for emp2 ended==========");
		
		System.out.println("==========Scopes Demo for emp3 started==========");
		System.out.println("Employee hashCode:: == "+emp3.hashCode());
		System.out.println("Address hashCode:: == "+emp3.getAddress().hashCode());
		System.out.println("==========Scopes Demo for emp2 ended==========");
		*/
		((ConfigurableApplicationContext)context).close();

	}
}

/*
 * Singleton demo
 * ==========Scopes Demo for emp2 started==========
Employee hashCode:: == 120694604
Address hashCode:: == 916419490
==========Scopes Demo for emp2 ended==========
==========Scopes Demo for emp3 started==========
Employee hashCode:: == 120694604
Address hashCode:: == 916419490
==========Scopes Demo for emp2 ended==========
Prototype Demo
==========Scopes Demo for emp2 started==========
Employee hashCode:: == 861842890
Address hashCode:: == 553871028
==========Scopes Demo for emp2 ended==========
==========Scopes Demo for emp3 started==========
Employee hashCode:: == 250370634
Address hashCode:: == 724125922
==========Scopes Demo for emp2 ended==========

 */
