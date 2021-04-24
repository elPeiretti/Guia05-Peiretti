package died.guia5;

public class ServicioEstandar extends Servicio {

	private Double montoFijo;
	private Double comisionTrabajador;
	
	public ServicioEstandar(Oficio tipo, Double montoFijo, Double comisionTrabajador, boolean urgente) {
		this.tipo=tipo;
		this.montoFijo=montoFijo;
		this.comisionTrabajador=comisionTrabajador;
		this.urgente=urgente;
	}
	
	@Override
	public Double costo() {
		Double c = this.montoFijo + this.montoFijo*comisionTrabajador;
		if(this.urgente)
			return c+c*0.5;
		return c; 
	}

	public Double getMontoFijo() {
		return montoFijo;
	}

	public void setMontoFijo(Double montoFijo) {
		this.montoFijo = montoFijo;
	}

	public Double getComisionTrabajador() {
		return comisionTrabajador;
	}

	public void setComisionTrabajador(Double comisionTrabajador) {
		this.comisionTrabajador = comisionTrabajador;
	}
	
	
	
}
