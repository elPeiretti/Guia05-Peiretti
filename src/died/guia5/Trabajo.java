package died.guia5;
import java.time.*;

public class Trabajo implements Contratable{
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	public boolean finalizado() {
		return fechaFin!=null;
	}

	@Override
	public Double costo() {
		// TODO Auto-generated method stub
		return null;
		
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public LocalDate gerFechaFin() {
		return fechaFin;
	}
	
}
