package died.guia5;
import java.time.*;

public class Trabajo implements Contratable{
	
	LocalDate fechaInicio;
	LocalDate fechaFin;
	
	public boolean finalizado() {
		return fechaFin!=null;
	}

	@Override
	public Double costo() {
		// TODO Auto-generated method stub
		return null;
		
	}
	
}
