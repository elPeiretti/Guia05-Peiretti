package died.guia5;

public class Oficio {
	private String tipo;

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public boolean equals(Oficio o) {
		return this.tipo.equalsIgnoreCase(o.getTipo());
	}
}
