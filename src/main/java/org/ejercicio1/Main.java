package org.ejercicio1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // retrieve configured instance
        Saludo serviceSaludo = context.getBean("saludoBean", Saludo.class);

        serviceSaludo.imprimirSaludo();
    }

}