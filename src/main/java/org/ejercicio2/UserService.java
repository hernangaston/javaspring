package org.ejercicio2;

import org.ejercicio2.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notificacionService;

    public UserService() {
    }

    public UserService(NotificationService notificacionService) {
        System.out.println("Constructor UserService");
        this.notificacionService = notificacionService;
        notificacionService.imprimir();
    }
}
