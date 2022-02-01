
public class OperadoresLogicos {

    public static void main(String[] args) {
        Boolean carrinhoMaiorQhe100 = false;
        Boolean periodoDePromocao = true;
        Boolean jaFezCompraNaLoja = true;
        Boolean pagamentoAVista = true;

  //    Boolean aplicarDesconto  = carrinhoMaiorQhe100 && periodoDePromocao;

  //    Boolean aplicarDesconto = carrinhoMaiorQhe100 || periodoDePromocao;

  //    Boolean aplicarDesconto = periodoDePromocao & carrinhoMaiorQhe100 & jaFezCompraNaLoja;

  //    Boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQhe100 || jaFezCompraNaLoja;

        Boolean aplicarDesconto = periodoDePromocao & (carrinhoMaiorQhe100 || jaFezCompraNaLoja) && pagamentoAVista;

        if (aplicarDesconto){
            System.out.println("Sim! Aplicar Desconto.");
        } else{
            System.out.println("Não aplicar Desconto.");
        }
    }

}
