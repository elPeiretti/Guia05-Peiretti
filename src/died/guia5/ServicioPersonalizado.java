package died.guia5;

public class ServicioPersonalizado extends Servicio{

	private Double presupuesto;
	private Double costoMateriales;
	private Double costoTransporte;
	
	@Override
	public Double costo() {
		Double c = presupuesto + costoMateriales + costoTransporte;
		if(this.urgente)
			return c+c*0.5;
		return c;
	}

}
