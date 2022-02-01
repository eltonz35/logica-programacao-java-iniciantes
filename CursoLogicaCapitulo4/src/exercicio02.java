/* Exercício : Desconto em frete em compras acima de R$100,00 */

import java.util.Scanner;


public class exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scan.nextDouble();
		
		int frete = 15;
        Double valorFinal = null;
		
		if(valorProduto < 100) {
			valorFinal = valorProduto + frete;
		}
		else {
			valorFinal = valorProduto;
		}
		
		System.out.println("O valor final do produto é : " + valorFinal +" reais" );
		
	 scan.close();
	}
 
}
