import java.util.Scanner;

public class Vetores1Dimensao {

    public static void main(String[] args) {
//        String[] cardapio = {"Calabresa", "Atum", "Queijo", "Presunto"};
//
//        System.out.println("Escolha o sabor:");
//
//        for (int i = 0; i < cardapio.length; i++) {
//            System.out.println("[" + i + "]" + cardapio[i]);
//        }
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Digite o numero referente ao sabor: ");
//        Integer saborEscolhido = scan.nextInt();
//
//        System.out.println("Você escolheu o sabor: " + cardapio[saborEscolhido]);
//
//        scan.close();

//        String[] cardapio = {"Calabresa", "Atum", "Queijo", "Presunto"};
//
//        cardapio[3] = "Frango";
//        for (int i = 0; i < cardapio.length; i++) {
//            System.out.println(cardapio[i]);
//        }

        String[] cardapio = new String[4];
        cardapio[0] = "Calabresa";
        cardapio[1] = "Atum";
        cardapio[2] = "Queijo";
        cardapio[3] = "Presunto";

        for (int i = 0; i < cardapio.length; i++) {
             System.out.println(cardapio[i]);
        }


    }
}
