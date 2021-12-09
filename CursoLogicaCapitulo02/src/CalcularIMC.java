import java.util.Scanner;

public class CalcularIMC {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua altura: ");
		Double altura = scanner.nextDouble();
		
	    System.out.print("Digite o seu peso: ");
	    Double peso = scanner.nextDouble();
	    
	    Double resultado = altura*altura;
	    
	    Double IMC = peso / resultado;
	    
	    System.out.println("O seu IMC é: " + IMC);
	    
	    scanner.close();
		
	}

}
