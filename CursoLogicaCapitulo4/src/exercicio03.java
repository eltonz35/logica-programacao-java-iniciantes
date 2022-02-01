/* Exercício : Cálculo de gastos familiar */

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gastos Familiar");
		
		System.out.println();
		
		System.out.print("Digite o valor da conta de luz: ");
		Double contaLuz = scan.nextDouble();
		
		System.out.print("Digite o valor da conta de agua: ");
		Double contaAgua = scan.nextDouble();
		
		System.out.print("Digite o valor da conta de telefone: ");
		Double contaTelefone = scan.nextDouble();
		
		System.out.println("Digite o valor da conta da escola: ");
		Double contaEscola = scan.nextDouble();
		
		System.out.print("Digite o valor da fatura do cartao: ");
		Double faturaCartao = scan.nextDouble();
		
		System.out.print("Digite o valor do gasto com mercado: ");
		Double gastoMercado = scan.nextDouble();

		
	 scan.close();	
	}

}
