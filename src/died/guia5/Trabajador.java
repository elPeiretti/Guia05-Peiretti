package died.guia5;
import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Trabajo> Trabajos;
	private String nombre;
	
	private String email;
	private Oficio oficio;
	private Double costoPorHora;
	private Double comision;
	
	public void AgregarTarea(Trabajo t) {
		
	}
	public void marcarTareaFinalizada() {}
	
	public ArrayList<Trabajo> getTrabajos() {
		return Trabajos;
	}
	public String getNombre() {
		return nombre;
	}
	public String getEmail() {
		return email;
	}
	public Oficio getOficio() {
		return oficio;
	}
	public Double getCostoPorHora() {
		return costoPorHora;
	}
	public Double getComision() {
		return comision;
	}
}
