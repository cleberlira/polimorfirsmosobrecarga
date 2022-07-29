package atividadesabado;

public class Velho extends Imovel {
	
	private double desconto;

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double calcular() {
		
		double novovalor = preco - desconto;
		
		return novovalor;
	}
	
	public void imprimir() {
		System.out.println("Imprimindo desconto " + desconto);
	}

}
