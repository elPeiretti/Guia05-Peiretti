package died.guia5;

public class OficioNoCoincideException extends Throwable {
	
	public OficioNoCoincideException(String oficioTarea,String oficioTrabajador) {
		super("El oficio "+ oficioTarea+
				" requerido para realizar la tarea no coincide con el oficio del Trabajador ("
				+oficioTrabajador+")");
	}

}
