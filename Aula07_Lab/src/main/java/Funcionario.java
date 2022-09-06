public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(){

    }
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Salario: "+this.salario);
    }

    public void trabalhar(){
        System.out.println("O(a) "+this.nome+" esta trabalhando.");
        System.out.println();
    }

    public void salarioBonus(){
        System.out.println("Salario novo convencional: "+this.salario*1.05);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
