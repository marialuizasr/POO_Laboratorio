public class Main {

    public static void main(String[] args) {

        Nave n1 = new Nave("foguete", true, 1000);
        Arma arma = new Arma("Eletronica", 500);
        n1.arma.tipo = "Fogo";
        n1.arma.poder = 900;
        n1.mostraInfo();
        n1.adicionaArma(arma);
        n1.mostraInfo();
    }

}
