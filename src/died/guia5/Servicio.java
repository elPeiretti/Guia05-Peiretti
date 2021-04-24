package died.guia5;

public abstract class Servicio implements Contratable{
	
	protected Oficio tipo;
	protected boolean urgente;
	
	public Oficio getTipo() {
		return tipo;
	}
	public void setTipo(Oficio tipo) {
		this.tipo = tipo;
	}
	public boolean isUrgente() {
		return urgente;
	}
	public void setUrgente(boolean urgente) {
		this.urgente = urgente;
	}
	
}
