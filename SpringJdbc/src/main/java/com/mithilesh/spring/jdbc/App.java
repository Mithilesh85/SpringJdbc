package com.mithilesh.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mithilesh.spring.jdbc.dao.StudentDao;
import com.mithilesh.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program is started....." );
        
        //jdbc template
        
       ApplicationContext context=
    		   new ClassPathXmlApplicationContext("config.xml");
      
       StudentDao studentDao = context.getBean("StudentDao",StudentDao.class);
//       
//       Student student=new Student();
//       student.setId(123);
//       student.setName("raja");
//       student.setCity("singrauli");
//       
//       int result = studentDao.insert(student);
//       
      // System.out.println("inserted data"+result);
       
//       Student student=new Student();
//       student.setId(102);
//       student.setName("akhilesh");
//       student.setCity("delhi");
//       
//       int result = studentDao.change(student);
//       System.out.println("changed data"+result);
//       
       
       int result = studentDao.delete(104);
       
       System.out.println("deleted data"+result);
       
    }


} 









