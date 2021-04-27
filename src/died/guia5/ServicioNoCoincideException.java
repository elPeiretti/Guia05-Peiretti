package died.guia5;

public class ServicioNoCoincideException extends Throwable {


	public ServicioNoCoincideException() {
		super("El servicio no puede tener diferente oficio que el trabajo a realizar");
	}

}
