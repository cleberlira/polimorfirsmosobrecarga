package atividadesabado;

public class Lampada {

	private float potencia;
	private boolean estado;
	
	
	public Lampada(boolean estado) {
		this.estado = estado;
	}
	
	public Lampada() {
		this.potencia = 60;
	}
	
	public Lampada(float potencia) {
		this.potencia = potencia;
	}
	
}
