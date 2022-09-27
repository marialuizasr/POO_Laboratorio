public class Main {
    public static void main(String[] args) {
        Arquiteto arquiteto = new Arquiteto("Joao",21,1000, "Design");
        Engenheiro engenheiro = new Engenheiro("Ze",20,1000, "Computacao");
        Professor professor = new Professor("Maria", 25,2000, "POO");

        // TESTANDO HERANÇA
        arquiteto.mostraInfo();
        engenheiro.mostraInfo();
        professor.mostraInfo();

        arquiteto.trabalhar();
        engenheiro.trabalhar();
        professor.trabalhar();

        arquiteto.salarioBonus();
        engenheiro.salarioBonus();
        professor.salarioBonus();

        // POLIMORFISMO
        // PARA ENTENDER QUE ARQUITETO, PROFESSOR E ENGENHEIRO CONSEGUEM FAZER PARTE DE FUNCIONÁRIO
        // POR ARRAY
        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = arquiteto;
        funcionarios[1] = engenheiro;
        funcionarios[2] = professor;

        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] != null) {
                funcionarios[i].mostraInfo();
                funcionarios[i].trabalhar();
                funcionarios[i].salarioBonus();
            }
        }

        // POR OBJETO SEM SER ARRAY
        Funcionario f = new Funcionario();
        f = arquiteto;

        f.mostraInfo();
        f.trabalhar();
        f.salarioBonus();

        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] != null) {
                if(funcionarios[i] instanceof Engenheiro){
                    Engenheiro e = (Engenheiro)funcionarios[i];
                    e.mostraInfo();
                    e.trabalhar();
                    e.salarioBonus();
                }
                else if (funcionarios[i] instanceof Professor) {
                    Professor p = (Professor) funcionarios[i];
                    p.mostraInfo();
                    p.trabalhar();
                    p.salarioBonus();
                }
            }
        }
    }
}
