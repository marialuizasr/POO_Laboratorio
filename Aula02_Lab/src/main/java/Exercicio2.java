import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        float peso;
        float altura;
        float imc;

        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o peso:");
        peso = in.nextFloat();
        System.out.println("Entre com a altura");
        altura = in.nextFloat();

        imc = peso/(altura*altura);

        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        }
        else if(imc <= 24.9){
            System.out.println("Peso ideal (parabens)");
        }
        else if(imc <= 29.9){
            System.out.println("Levemente acima do peso");
        }
        else if(imc <= 34.9){
            System.out.println("Obesidade grau I");
        }
        else if(imc <= 39.9){
            System.out.println("Obesidade grau II (severa)");
        }
        else {
            System.out.println("Obesidade grau III (morbida)");
        }

    }
}
