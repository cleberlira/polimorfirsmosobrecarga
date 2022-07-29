package atividadesabado;

public class Novo extends Imovel {
    private double adicional ;

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public double calcular() {
		
		double novovalor = preco + adicional;
		
		return novovalor;
	}
	
	public void imprimir() {
		System.out.println("Imprimindo valor adicional " + adicional);
	}
}
