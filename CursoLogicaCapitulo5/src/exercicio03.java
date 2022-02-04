import java.util.Scanner;

/* Imprima o nome do dia da semana */
public class exercicio03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        Integer semana = scan.nextInt();




        switch (semana) {
            case 1:
                System.out.print("Hoje é Domingo!");
                break;
            case 2:
                System.out.print("Hoje é Segunda!");
                break;
            case 3:
                System.out.print("Hoje é Terça!");
                break;
            case 4:
                System.out.print("Hoje é Quarta!");
                break;
            case 5:
                System.out.print("Hoje é Quinta!");
                break;
            case 6:
                System.out.print("Hoje é Sexta!");
                break;
            case 7:
                System.out.print("Hoje é Sábado!");
                break;
            default:
                System.err.print("Digite um dia valido! ");
                System.exit(1);





        }
    scan.close();
    }
}
