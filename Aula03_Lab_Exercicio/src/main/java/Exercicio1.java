public class Exercicio1 {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.nome = "Salon Line SOS Bomba";
        p1.codigoSerie = 1;
        p1.codigoProduto = "35#0001";
        p1.categoria = "Shampoo";
        p1.quantidade = 8;

        p2.nome = "Griffus para Cachos";
        p2.codigoSerie = 2;
        p2.codigoProduto = "35#0002";
        p2.categoria = "Condicionador";
        p2.quantidade = 8;

        p1.mostraInfo();
        p2.mostraInfo();
    }
}
