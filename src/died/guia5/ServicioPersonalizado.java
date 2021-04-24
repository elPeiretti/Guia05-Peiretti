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
