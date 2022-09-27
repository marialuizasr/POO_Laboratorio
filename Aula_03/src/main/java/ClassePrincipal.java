public class ClassePrincipal {

    public static void main(String[] args) {

        //DECLARANDO OS OBJETOS
        Funcionario f1;
        Funcionario f2;

        //INSTANCIANDO OS FUNCIONÁRIOS
        f1 = new Funcionario();
        f1 = new Funcionario("Maria Luiza Silva Raimundo",20,"081.349.486-93",800.00F);
        f2 = new Funcionario();
        f2 = new Funcionario("Elmar Savio Raimundo",61,"412.081.376-20",10000.00F);

        /*
        //DANDO VALORES AOS ATRIBUTOS DOS OBJETOS
        f1.nome = "Maria Luiza Silva Raimundo";
        f1.idade = 20;
        f1.CPF = "081.349.486-93";
        f1.salario = 800.00F;

        f2.nome = "Elmar Savio Raimundo";
        f2.idade = 61;
        f2.CPF = "412.081.376-20";
        f2.salario = 10000.00F;
         */

        //PRINTANDO AS INFORMAÇÕES
        f1.mostraInfo();
        f2.mostraInfo();

        //TIRANDO FERIAS
        f1.tiraFerias("Dezembro");
        f2.tiraFerias("Janeiro");

        //CALCULANDO SALARIO ANUAL E SAINDO COM O DADO
        System.out.println("Salario anual do(a) "+f1.nome+" :"+f1.calculaSalarioAnual());
        System.out.println("Salario anual do(a) "+f2.nome+" :"+f2.calculaSalarioAnual());
    }

}
