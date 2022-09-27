public class Exercicio2 {
    public static void main(String[] args) {

        Carro c1 = new Carro("cinza","VW","SpaceFox",220.00,120.00,"EA111",1.6F);
        Carro c2 = new Carro("prata","VW","Fox",220.00,120.00,"EA111",1.6F);

        c1.ligar();
        c2.acelerar();
        c2.mostraInfo();
    }
}
