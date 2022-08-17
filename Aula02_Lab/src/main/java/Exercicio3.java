import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        double numero1;
        double numero2;
        char operacao;

        Scanner input = new Scanner(System.in);
        System.out.println("Entre com os 2 numeros:");
        numero1 = input.nextDouble();
        numero2 = input.nextDouble();
        System.out.println("Entre com a operacao desejada (+,-,*,/,^):");
        operacao = input.next().charAt(0);

        switch(operacao){
            case '+':
                System.out.println(numero1 + " + "+numero2+" = "+(numero1+numero2));
                break;
            case '-':
                System.out.println(numero1 + " - "+numero2+" = "+(numero1-numero2));
                break;
            case '*':
                System.out.println(numero1 + " * "+numero2+" = "+(numero1*numero2));
                break;
            case '/':
                if(numero2 == 0)
                    System.out.println("Operacao invalida, nao existe divisao por zero");
                else System.out.println(numero1 + " / "+numero2+" = "+(numero1/numero2));
                break;
            case '^':
                System.out.println(numero1 + " ^ "+numero2+" = "+(Math.pow(numero1,numero2)));
                break;
            default:
                System.out.println("Operador invalido");
                break;

        }

    }
}
