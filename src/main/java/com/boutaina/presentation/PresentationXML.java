package com.boutaina.presentation;

import com.boutaina.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationXML {
    public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         IMetier metier = context.getBean(IMetier.class);
         System.out.println("Res = " + metier.calcule());
    }
}
