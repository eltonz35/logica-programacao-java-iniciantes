import java.util.Scanner;

//Calcular o valor do produto e verificar se o mesmo recebe desconto//
public class exercicio04 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		Double quantidadeProduto = scanner.nextDouble();
		
		Double subtotal = valorProduto * quantidadeProduto;
		
		Double percentual = 10.0;
		
		if (quantidadeProduto > 10) {
			
		} else {
			percentual = 0.0;
		}
		
		Double desconto = subtotal * percentual / 100;
		
		Double valorTotal = subtotal - desconto ;
		
		System.out.println("Valor Total: " + valorTotal);
		
		scanner.close();
		
		
	}

}
