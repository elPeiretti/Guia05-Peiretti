package died.guia5;

import java.time.*;
import java.time.temporal.ChronoUnit;
public class Alquiler implements Contratable{ // el enunciado trata a la maquina como si fuera herramienta

	String nombre;
	LocalDate fechaInicio;
	LocalDate fechaFin;
	LocalDate fechaDevolucion;
	Double costoPorDia;
	
	public Double costo() {
		return costoPorDia*ChronoUnit.DAYS.between(fechaDevolucion, fechaInicio);
	}
	
	public boolean enMora() {
		return fechaFin.compareTo(fechaDevolucion) > 0;
	}
	
	public boolean finalizado() {
		return fechaDevolucion!=null;
	}
	
	
}
