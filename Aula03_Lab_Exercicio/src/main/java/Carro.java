public class Carro {

    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;
    Motor motor;

    public Carro(String cor, String marca, String modelo, double velocidadeMax, double velocidadeAtual, String tipo, float potencia){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = velocidadeAtual;
        this.motor = new Motor();
        this.motor.tipo = tipo;
        this.motor.potencia = potencia;
    }

    void ligar(){
        System.out.println("O carro de modelo "+this.modelo+" ligou.");
    }
    void acelerar(){
        System.out.println("O carro de modelo "+this.modelo+" acelerou.");
    }
    void mostraInfo(){
        System.out.println("Mostrando informacoes:");
        System.out.println("Cor: "+this.cor);
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Velocidade Maxima: "+this.velocidadeMax);
        System.out.println("Velocidade atual: "+this.velocidadeAtual);
        System.out.println("Tipo do motor: "+this.motor.tipo);
        System.out.println("Potencia do motor: "+this.motor.potencia);
    }
}
