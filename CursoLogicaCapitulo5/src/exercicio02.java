/* Calcule o bonus do funcionário(a) */

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double i = 0.8;

        System.out.print("Informe a meta do faturamento anual da empresa: "); //faturamento para o ano que passou
        Double metaFaturamentoAnual= scan.nextDouble();

        System.out.print("Informe o faturamento real da empresa: ");
        Double faturamentoReal = scan.nextDouble();

        System.out.print("Informe a media salarial do funcionario: ");
        Double mediaSalarial = scan.nextDouble();

        if(faturamentoReal >= metaFaturamentoAnual) {
            System.out.println("O funcionario ganhou o bonus no valor de: " + mediaSalarial);
        }else if((faturamentoReal < metaFaturamentoAnual) && (faturamentoReal >= metaFaturamentoAnual * i)) {
            System.out.println("O funcionario ganhou o bonus no valor de: " + mediaSalarial * i);
        }

        scan.close();
    }
}
