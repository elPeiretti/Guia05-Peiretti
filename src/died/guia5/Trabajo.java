package died.guia5;
import java.time.*;
import java.util.ArrayList;


public class Trabajo implements Contratable{
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	ArrayList<Servicio>Servicios;
	
	public boolean finalizado() {
		return fechaFin!=null;
	}

	@Override
	public Double costo() {
		Double total=0d;
		for(Servicio s: Servicios) {
			total+=s.costo();
		}
		
		return total;
		
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public LocalDate gerFechaFin() {
		return fechaFin;
	}
	
}
