import java.util.Scanner;

//Calculando o quadrado de um número//

public class exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero: ");
		Integer numero = scanner.nextInt();
		
		Integer resultado = numero*numero;
		
		System.out.println("O resultado é: " + resultado);
		
		scanner.close();
				
	}

}
