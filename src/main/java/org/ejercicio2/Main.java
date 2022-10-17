package org.ejercicio2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // retrieve configured instance
        UserService serviceUser = (UserService) context.getBean("userService", UserService.class);

        serviceUser.notificacionService.imprimir();
    }
}
