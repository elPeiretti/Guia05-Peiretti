package died.guia5;

public class AlquilerNoEntregadoException extends Throwable {
	
	public AlquilerNoEntregadoException() {
		super("El usuario no puede alquilar mas hasta que devuelva los que debe");
	}
}
