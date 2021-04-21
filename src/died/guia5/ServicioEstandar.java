package died.guia5;

public class ServicioEstandar extends Servicio {

	private Double montoFijo;
	private Double comisionTrabajador;
	
	@Override
	public Double costo() {
		Double c = this.montoFijo + comisionTrabajador;
		if(this.urgente)
			return c+c*0.5;
		return c; 
	}
	
}
