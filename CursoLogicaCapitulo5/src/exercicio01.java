/* Verificar se a pessoa passou no concurso publico */

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe a nota de portugues: ");
        double notaPortugues = scanner.nextDouble();

        System.out.println("Informe a nota de matematica: ");
        double notaMatematica = scanner.nextDouble();

        Boolean notaMaxima =  (notaMatematica + notaPortugues) <= 200; // o somatório das notas não pode ultrapassar 200
        Boolean minimoParaPassar = (notaMatematica + notaPortugues) >= 150; // a soma tem que dar no mínimo 150
        Boolean provaResultado = ((notaMatematica >= 60) && (notaPortugues >= 60)) ; // nenhuma nota pode ter valor inferior a 60

        if(provaResultado && minimoParaPassar && notaMaxima)  {
            System.out.print("O candidato passou no concurso. ");
        }else {
            System.out.print("O candidato foi reprovado. ");
        }


    }
}
