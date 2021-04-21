package died.guia5;

import java.time.*;
import java.time.temporal.ChronoUnit;
public class Alquiler implements Contratable{ // el enunciado trata a la maquina como si fuera herramienta

	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private LocalDate fechaDevolucion;
	private Double costoPorDia;
	
	public Double costo() {
		return costoPorDia*ChronoUnit.DAYS.between(fechaDevolucion, fechaInicio);
	}
	
	public boolean enMora() {
		return fechaFin.compareTo(fechaDevolucion) > 0;
	}
	
	public boolean finalizado() {
		return fechaDevolucion!=null;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
