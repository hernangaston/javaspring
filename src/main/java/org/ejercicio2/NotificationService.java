package org.ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public NotificationService() {
        System.out.println("Constructor NotificationService");
    }

    public static void imprimir() {
        System.out.println("Notificacion Ejerciocio 2 beans scan-context");
    }
}
