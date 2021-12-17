import java.util.Scanner;
//Imprimir o nome e o sobrenome da pessoa//
public class exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Olá: " + nome + " " + sobrenome + "!");
		
		scanner.close();
		
	}

}
