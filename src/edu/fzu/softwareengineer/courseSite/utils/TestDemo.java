package edu.fzu.softwareengineer.courseSite.utils;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.fzu.softwareengineer.courseSite.service.StudentService;

public class TestDemo {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService ss=ctx.getBean("studentService",StudentService.class);
		if(ss.checkLogin(221300217, "999999")){
			System.out.println("success...");
		}else{
			System.out.println("error...");
		}
	}

}
