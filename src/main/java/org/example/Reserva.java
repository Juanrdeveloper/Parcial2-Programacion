package org.example;

import java.time.LocalDate;

class Reserva {
    private String idReserva;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double costoTotal;

    public Reserva(String idReserva, Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoTotal = vehiculo.calcularPrecio((int) (fechaFin.toEpochDay() - fechaInicio.toEpochDay()), false, false);
    }

    public void confirmarReserva() {
        vehiculo.reservar();
    }

    public double getCostoTotal() {
        return costoTotal;
    }
}
