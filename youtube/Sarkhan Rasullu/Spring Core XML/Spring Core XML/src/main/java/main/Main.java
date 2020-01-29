package main;

import beans.Student;
import dao.UserDaoInter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        Student obj = (Student) context.getBean("student");//DI
        System.out.println(obj);

//                UserDaoInter obj = (UserDaoInter) context.getBean("userDAO");
    }
}
