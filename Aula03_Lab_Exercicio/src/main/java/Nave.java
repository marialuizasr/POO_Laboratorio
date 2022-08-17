public class Nave {

    String nome;
    int velocidade;
    boolean velocidadeDaLuz;
    Arma arma;

    public Nave(String nome, boolean velocidadeDaLuz, int velocidade)
    {
        this.nome = nome;
        this.velocidadeDaLuz = velocidadeDaLuz;
        this.velocidade = velocidade;
        System.out.println("Nave criada!");
        this.arma = new Arma();
    }

    void adicionaArma(Arma arma){
        this.arma = arma;
    }

    void mostraInfo()
    {
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade: "+this.velocidade);
        System.out.println("Velocidade da Luz? "+((this.velocidadeDaLuz)?"Sim":"Nao"));
        System.out.println("Tipo da arma: "+this.arma.tipo);
        System.out.println("Poder da arma: "+this.arma.poder);
    }

}
