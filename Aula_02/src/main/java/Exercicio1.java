import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        String opcao;

        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a opcao E ou OU para imprimir a tabela da verdade:");
        opcao = input.nextLine();

        if(opcao.equals("E")){
            System.out.println("Logica E:");
            System.out.println("0 E 0 = 0");
            System.out.println("0 E 1 = 0");
            System.out.println("1 E 0 = 0");
            System.out.println("1 E 1 = 1");
        }
        else if(opcao.equals("OU")){
            System.out.println("Logica OU:");
            System.out.println("0 OU 0 = 0");
            System.out.println("0 OU 1 = 1");
            System.out.println("1 OU 0 = 1");
            System.out.println("1 OU 1 = 1");
        }
        else {
            System.out.println("Digitou uma opcao invalida.");
        }
    }

}
