import java.util.Scanner;

public class AlterandoValorVariavel {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o tipo do pagamento [1 = a vista / 2 = a prazo]: ");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamentoaVista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		if (pagamentoaVista) {
			
		} else {
			juros = 10.0;
		}
		
		Double acrescimo = valorProduto * juros / 100;
		
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Valor total: " + valorTotal);
		
		scanner.close();
	}

}
