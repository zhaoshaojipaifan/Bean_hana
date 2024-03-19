package com.example.bean_hana;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MyNameTest_hana {
    public static void main(String[] args){
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("applicationStudent.xml");
        MyName_hana myNamehana =(MyName_hana)applicationContext.getBean("student");
        System.out.println(myNamehana);
        AbstractApplicationContext ac=(AbstractApplicationContext)applicationContext;
        ac.registerShutdownHook();
    }
}