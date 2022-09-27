import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Biblioteca b1 = new Biblioteca();
        b1.nome = "Biblioteca Municipal";

        boolean flag = true;

        while(flag){
            System.out.println("Bem-vindo ao menu de informacoes:");
            System.out.println("1- adicionar um livro");
            System.out.println("2- Mostrar as informacoes");
            System.out.println("3- alugar o livro");
            System.out.println("4- para sair do menu");

            int op = input.nextInt();

            switch(op){
                case 1:
                    Livro l1;
                    System.out.println("Entre com o nome do livro:");
                    input.nextLine();
                    String nomeLivro = input.nextLine();
                    System.out.println("Entre com a quantidade de paginas:");
                    int qtdPaginas = input.nextInt();
                    l1 = new Livro(nomeLivro, qtdPaginas);
                    b1.adicionaLivro(l1);
                    break;
                case 2:
                    b1.mostraInfo();
                    break;
                case 3:
                    System.out.println("Entre com o nome do livro:");
                    input.nextLine();
                    String nomeDoLivro = input.nextLine();
                    b1.alugarLivro(nomeDoLivro);
                    if (b1.alugarLivro(nomeDoLivro)){
                        System.out.println("O livro "+nomeDoLivro+" foi alugado com sucesso");
                    }
                    else {
                        System.out.println("O livro "+nomeDoLivro+" não foi encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Voce saiu do menu");
                    flag = false;
                    break;
                default:
                    System.out.println("Digite um valor valido:");
                    break;
            }
        }

        /*
       Livro l1 = new Livro("Ponto de Impacto", 700);

       b1.adicionaLivro(l1);
       b1.mostraInfo();

         */

    }
}
