package died.guia5;

public class ServicioPersonalizado extends Servicio{

	private Double presupuesto;
	private Double costoMateriales;
	private Double costoTransporte;
	
	public ServicioPersonalizado(Oficio tipo, Double presupuesto, Double costoMateriales, Double costoTransporte, boolean urgente) {
		this.presupuesto=presupuesto;
		this.costoMateriales=costoMateriales;
		this.costoTransporte=costoTransporte;
		this.tipo=tipo;
		this.urgente=urgente;
	}
	
	@Override
	public Double costo() {
		Double c = presupuesto + costoMateriales + costoTransporte;
		if(this.urgente)
			return c+c*0.5;
		return c;
	}

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Double getCostoMateriales() {
		return costoMateriales;
	}

	public void setCostoMateriales(Double costoMateriales) {
		this.costoMateriales = costoMateriales;
	}

	public Double getCostoTransporte() {
		return costoTransporte;
	}

	public void setCostoTransporte(Double costoTransporte) {
		this.costoTransporte = costoTransporte;
	}
	
	
}
