package org.example;


import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

class Administrador {
    private List<Vehiculo> flota;

    public Administrador() {
        this.flota = new ArrayList<>();
    }

    public void añadirVehiculo(Vehiculo vehiculo) {
        flota.add(vehiculo);
        System.out.println("Vehículo añadido: " + vehiculo.marca + " " + vehiculo.modelo);
    }

    public boolean verificarDisponibilidad(Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFin) {
        return vehiculo.isDisponible();
    }

    public List<Vehiculo> listarVehiculosDisponibles() {
        List<Vehiculo> disponibles = new ArrayList<>();
        for (Vehiculo vehiculo : flota) {
            if (vehiculo.isDisponible()) {
                disponibles.add(vehiculo);
            }
        }
        return disponibles;
    }
}