package atividadesabado;
import java.util.Scanner;
public class AppImovel {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(	"Qual imóvel você deseja comprar?  1 para novo e 2\n"
				+ "para velho. " );
		int opcao = teclado.nextInt();
		
		if (opcao ==1) {
			Novo imovel = new Novo();
			imovel.setAdicional(100);
			double novovalor = imovel.calcular();
			System.out.println("Novo valor " + novovalor);
			
		}else if (opcao==2) {
			Velho imovel = new Velho();
			imovel.setDesconto(100);
			double novovalor = imovel.calcular();
			System.out.println("Novo valor " + novovalor);
			
		}
	
		
		teclado.close();
		// TODO Auto-generated method stub

	}

}
