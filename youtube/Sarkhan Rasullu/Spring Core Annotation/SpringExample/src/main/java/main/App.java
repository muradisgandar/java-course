package main;

import az.company.customer.service.CustomerService;
import az.company.customer.service.inter.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext(new String[] {"Spring-AutoScan.xml"});

    	ICustomerService cust = (ICustomerService)context.getBean("customerService");
    	System.out.println(cust.getUsers());
    	
    }
}
