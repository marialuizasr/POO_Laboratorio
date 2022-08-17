public class Produto {

    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    void mostraInfo(){
        System.out.println("Codigo Serie: "+this.codigoSerie);
        System.out.println("Codigo Produto: "+this.codigoProduto);
        System.out.println("Nome: "+this.nome);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Quantidade: "+this.quantidade);
    }

}
