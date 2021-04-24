package died.guia5;
import java.util.ArrayList;
import java.time.*;

public class Usuario {
	
	private String nombre;
	private Integer dni;
	private Integer alquileresNoDevueltos;
	private ArrayList<Contratable> contratados;
	
	public String getNombre() {
		return nombre;
	}
	public Integer getDni() {
		return dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Integer getCantAlquileresNoDevueltos() {
		return alquileresNoDevueltos;
	}
	
	public ArrayList<Contratable> getContratados() {
		return contratados;
	}
	public void contratar(Servicio s) {		
		this.contratados.add(s);
	}
	public void contratar(Alquiler a) throws AlquilerNoEntregadoException{
		if(alquileresNoDevueltos>1) {
			throw new AlquilerNoEntregadoException();
		}
		else {
			this.contratados.add(a);
			this.alquileresNoDevueltos++;
		}
	}
	
	
}
