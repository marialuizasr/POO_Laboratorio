// O EXTENDS É PORQUE ENGENHEIRO TEM ATRIBUTOS/MÉTODOS IGUAIS AO DO FUNCIONÁRIO
public class Engenheiro extends Funcionario {

    private String ramo;
    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Ramo: "+this.ramo);
        System.out.println();
    }

    @Override
    public void trabalhar() {
        System.out.println("O(a) engenheiro(a) "+this.getNome()+" esta trabalhando.");
        System.out.println();
    }

    @Override
    public void salarioBonus() {
        super.salarioBonus();
        System.out.println("Salario novo do engenheiro: "+this.getSalario()*1.10);
        System.out.println();
    }
}
