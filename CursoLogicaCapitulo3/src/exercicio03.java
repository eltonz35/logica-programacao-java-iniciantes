import java.util.Scanner;

//Informar se o aluno foi aprovado //
public class exercicio03 {
	
	static final Double  NOTA_MINIMA_PARA_APROVACAO = 70.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		Double nota = scanner.nextDouble();
		
		Boolean notaAluno = nota >= NOTA_MINIMA_PARA_APROVACAO;
		
		if(notaAluno) {
			System.out.println("O aluno foi aprovado!!! ");
		}else {
			System.out.println("O aluno foi reprovado!!! ");
		}
		
	 scanner.close();	
	}
       
}
