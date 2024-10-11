package org.example;

import java.time.LocalDate; // Importar LocalDate
import java.util.List; // Para usar List

public class Main {
    public static void main(String[] args) {
        Administrador admin = new Administrador();
        Cliente cliente = new Cliente("CLI-001", "Juan Pérez");

        // Agregar un vehículo a la flota
        Camioneta camioneta = new Camioneta("VEH-001", "Toyota", "Hilux", 2020, 100, 1000);
        admin.añadirVehiculo(camioneta);

        // Cliente intenta reservar la camioneta
        try {
            cliente.reservarVehiculo(camioneta, LocalDate.now(), LocalDate.now().plusDays(5), false, true);
            System.out.println("Reserva confirmada con éxito.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Listar vehículos disponibles
        List<Vehiculo> disponibles = admin.listarVehiculosDisponibles();
        System.out.println("Vehículos disponibles: " + disponibles.size());
    }
}

