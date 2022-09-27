// // O EXTENDS É PORQUE PROFESSOR TEM ATRIBUTOS/MÉTODOS IGUAIS AO DO FUNCIONÁRIO
public class Professor extends Funcionario{

    String materia;
    public Professor(String nome, int idade, double salario, String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Materia: "+this.materia);
        System.out.println();
    }

    @Override
    public void trabalhar() {
        System.out.println("O(a) professor(a) "+this.getNome()+" esta trabalhando.");
        System.out.println();
    }

    @Override
    public void salarioBonus() {
        super.salarioBonus();
        System.out.println("Salario novo do professor: "+this.getSalario()*1.50);
        System.out.println();
    }
}
