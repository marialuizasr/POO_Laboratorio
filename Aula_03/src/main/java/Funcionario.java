public class Funcionario {

    int idade;
    String CPF;
    float salario;
    String nome;

    public Funcionario()
    {
        System.out.println("Funcionario Contratado!");
    }

    public Funcionario(String nome, int idade, String CPF, float salario)
    {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.salario = salario;
    }

    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Salario: " + this.salario);
    }

    void tiraFerias(String mes) {
        System.out.println(this.nome + " tira ferias em " + mes);
    }

    float calculaSalarioAnual(){
        return this.salario*12;
    }

}
