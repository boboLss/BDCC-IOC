package com.boutaina.presentation;

import com.boutaina.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.boutaina");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("Res = " + metier.calcule());
    }
}
