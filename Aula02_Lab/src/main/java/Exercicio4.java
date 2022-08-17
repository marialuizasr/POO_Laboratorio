import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        String senhaCorreta = "2002";
        String senhaFornecida;

        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a senha:");
        do{
            senhaFornecida = input.nextLine();
            if(!(senhaFornecida.equals(senhaCorreta))){
                System.out.println("Senha incorreta, digite novamente:");
            }
            else System.out.println("Senha correta!");
        }while(!(senhaFornecida.equals(senhaCorreta)));
    }
}
