public class Main1 {

    public static void main(String[] args) {
        /*
        int valor1 = 10;
        int valor2 = 3;

        float resultado = (float) valor1 / valor2; //utilizando casting

        double pi = 3.14159;
        float PI = 3.14159f;

        System.out.println(pi);
        System.out.println(PI);
        System.out.println(resultado);

        //mostrando que String é uma classe
        String nome = "Inatel Tecnologias";
        String nomeCortado = nome.substring(0, 5);
        String nomeMinusculo = nome.toLowerCase();
        String nomeJunto = nome.concat(nomeCortado);

        System.out.println(nome);
        System.out.println(nomeCortado);
        System.out.println(nomeMinusculo);
        System.out.println(nomeJunto);

        if (nome.equals(nomeCortado)) { //if(nome == nomeCortado
            System.out.println("Sao iguais");
        } else {
            System.out.println("Sao Diferentes");
        }

        //precisa fazer o casting
        double a= 10.5;
        int b = (int) a;

        String nome2;
        int idade;
        float altura;
        String cpf;

        Scanner input = new Scanner(System.in); //para fazer entrada de dados

        System.out.println("Entre com o seu nome: ");
        nome2 = input.nextLine();
        System.out.println("Seu nome eh: " + nome2);

        System.out.println("Entre com a sua idade:");
        idade = input.nextInt();
        System.out.println("Idade: " + idade);

        System.out.println("Entre com a sua altura");
        altura = input.nextFloat();
        System.out.println("Altura = " + altura);

        input.nextLine();  //mesma função do cin.ignore() no C++

        System.out.println("Entre com seu cpf: ");
        cpf = input.nextLine();
        System.out.println("CPF: " + cpf);

         */
        int[] inteiros = {1,2,3,4,5};

        for (int valor : inteiros) {
            System.out.println("Valor para o for each = " + valor);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor para o for normal = " + inteiros[i]);
        }

        int estado = 1;

        switch (estado)
        {
            case 0:
                System.out.println("Desligado");
                break;
            case 1:
                System.out.println("Ligado");
                break;
            default:
                System.out.println("Stand by");
                break;
        }
    }
}
