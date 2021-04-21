package died.guia5;
import java.util.ArrayList;
import java.time.*;

public class Usuario {
	
	private String nombre;
	private Integer dni;
	private Integer alquileresNoDevueltos;
	private ArrayList<Contratable> Contratados;
	
	public String getNombre() {
		return nombre;
	}
	public Integer getDni() {
		return dni;
	}
	public Integer getAlquileresNoDevueltos() {
		return alquileresNoDevueltos;
	}
	public ArrayList<Contratable> getContratados() {
		return Contratados;
	}
	public void contratar(Servicio s,Oficio o,boolean urgente) {
		
	}
	public void contratar(String nombreHerramienta, LocalDate fechaInic, LocalDate fechaFin) {
		
	}
	
	
}
