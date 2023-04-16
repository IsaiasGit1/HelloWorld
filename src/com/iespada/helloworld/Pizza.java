package com.iespada.helloworld;

public class Pizza {

	private String nombre;
	private double costoDeProduccion;
	private int cantidadProducida;
	private double precioVenta;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCostoDeProduccion() {
		return costoDeProduccion;
	}
	public void setCostoDeProduccion(double costoDeProduccion) {
		this.costoDeProduccion = costoDeProduccion;
	}
	public int getCantidadProducida() {
		return cantidadProducida;
	}
	public void setCantidadProducida(int cantidadProducida) {
		this.cantidadProducida = cantidadProducida;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
}
