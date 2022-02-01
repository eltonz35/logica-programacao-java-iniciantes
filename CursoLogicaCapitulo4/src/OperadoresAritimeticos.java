
public class OperadoresAritimeticos {

	public static void main(String[] args) {
		
		Integer adicao = 1 + 1;
		System.out.println("Adição: " + adicao);
		
		Integer subtracao = 1 - 1;
		System.out.println("Subtração: " + subtracao);
		
		Integer multipicacao = 2 * 2;
		System.out.println("Multiplicação: " + multipicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Divisão: " + divisao);
		
		Integer modulo = 7 % 4;
		System.out.println("Módulo: " + modulo);
		
		Integer precedencia01 = 1 + 1 * 5;
		System.out.println("Precedência01: " + precedencia01);
		
		Integer precedencia02 = (1 + 1) * 5;
		System.out.println("Precedencia02: " + precedencia02);
	}
}
