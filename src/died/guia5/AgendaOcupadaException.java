package died.guia5;

public class AgendaOcupadaException extends Throwable {

	public AgendaOcupadaException(String nombreTrabajador) {
		
		super("El trabajador"+nombreTrabajador+" ya se encuentra realizando un trabajo");

	}
}
