package died.guia5;
import java.time.*;
import java.util.ArrayList;


public class Trabajo{
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Oficio oficioRequerido;
	ArrayList<Servicio>Servicios;
	
	public Trabajo(LocalDate fechaInicio, Oficio oficio) {
		this.fechaInicio=fechaInicio;
		this.oficioRequerido=oficio;
		this.Servicios=new ArrayList<Servicio>();
	}
	
	public boolean finalizado() {
		return fechaFin!=null;
	}

	
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
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate f) {
		this.fechaFin=f;
	}

	public Oficio getOficioRequerido() {
		return oficioRequerido;
	}
	public void setOficioRequerido(Oficio oficioRequerido) {
		this.oficioRequerido=oficioRequerido;
	}
	
}
