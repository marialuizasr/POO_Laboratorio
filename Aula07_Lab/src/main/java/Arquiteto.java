// O EXTENDS É PORQUE ARQUITETO TEM ATRIBUTOS/MÉTODOS IGUAIS AO DO FUNCIONÁRIO
public class Arquiteto extends Funcionario{

    private String especialidade;
    public Arquiteto(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Especialidade: "+this.especialidade);
        System.out.println();
    }

    @Override
    public void trabalhar() {
        System.out.println("O(a) arquiteto(a) "+this.getNome()+" esta trabalhando.");
        System.out.println();
    }

    @Override
    public void salarioBonus() {
        super.salarioBonus();
        System.out.println("Salario novo do earquiteto: "+this.getSalario()*1.15);
        System.out.println();
    }
}
