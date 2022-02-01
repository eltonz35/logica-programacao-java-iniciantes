/* Exercício de Verificação da Possibilidade de Aposentadoria */


import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a Idade: ");
        double idade = scanner.nextDouble();

        System.out.print("Informe o Tempo de Contribuicao: ");
        double tempoComtribuicao = scanner.nextDouble();

        Boolean aptoAposentar = (idade >= 55 && tempoComtribuicao >= 25);

        if(aptoAposentar) {
            System.out.println("Esta apto a aposentar ");
        }else{
            System.out.println("Nao esta apto a aposentar ");
        }

    }

}
