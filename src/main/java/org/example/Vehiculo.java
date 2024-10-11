package org.example;

abstract class Vehiculo {
    protected String idVehiculo;
    protected String marca;
    protected String modelo;
    protected int año;
    protected double costoDiario;
    protected boolean disponibilidad;

    public Vehiculo(String idVehiculo, String marca, String modelo, int año, double costoDiario) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.costoDiario = costoDiario;
        this.disponibilidad = true; // Por defecto, el vehículo está disponible
    }

    public double calcularPrecio(int dias, boolean seguro, boolean gps) {
        double precio = costoDiario * dias;
        if (seguro) {
            precio *= 1.1; // 10% adicional si se incluye seguro
        }
        if (gps) {
            precio += 5 * dias; // $5 por día por GPS
        }
        return precio;
    }

    public boolean isDisponible() {
        return disponibilidad;
    }

    public void reservar() {
        this.disponibilidad = false;
    }

    public void liberar() {
        this.disponibilidad = true;
    }
}
