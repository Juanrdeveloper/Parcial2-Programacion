package org.example;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

class Cliente {
    private String idCliente;
    private String nombre;
    private List<Reserva> reservas;

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
    }

    public void reservarVehiculo(Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFin, boolean seguro, boolean gps) {
        if (vehiculo.isDisponible() && reservas.isEmpty()) { // Verifica disponibilidad y si no tiene reservas activas
            String idReserva = "RES" + (reservas.size() + 1); // Genera ID de reserva
            Reserva reserva = new Reserva(idReserva, this, vehiculo, fechaInicio, fechaFin);
            reserva.confirmarReserva();
            reservas.add(reserva);
            System.out.println("Reserva confirmada: " + idReserva + ", Costo total: " + reserva.getCostoTotal());
        } else {
            System.out.println("El vehículo no está disponible o ya tienes una reserva activa.");
        }
    }
}
