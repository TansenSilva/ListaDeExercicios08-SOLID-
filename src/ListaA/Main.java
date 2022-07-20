package ListaA;

public class Main {
    public static void main(String[] args) {

        {
            Financeiro financeiro = new Financeiro();
            Turma turma1 = new Turma("Turma 1", 40);

            FuncionarioAdministrativo funcionario1 = new FuncionarioAdministrativo("Elivar", "123.123.232-33", "00023", "Secretaria de Educação", 2300, "Contador", "Júnior");

            Professor professor1 = new Professor("Joao", "432.765.987.01", "001", "Secretaria de Educação", 1500, "Doutorado", "Matemática", 30, 2);
            Professor professor2 = new Professor("Carlos", "435.876.143-67", "002", "Secretaria de Educação", 1500, "Mestrado", "Portugês", 28, 2);
            Professor professor3 = new Professor("Antonio", "134.098.564-78", "002", "Secretaria de Educação", 1500, "Mestrado", "Portugês", 28, 2);
            Professor professor4 = new Professor("José", "321.980.654-34", "002", "Secretaria de Educação", 1500, "Mestrado", "Portugês", 28, 2);
            Professor professor5 = new Professor("Maria", "189.564.675-21", "002", "Secretaria de Educação", 1500, "Mestrado", "Portugês", 28, 2);
            Professor professor6 = new Professor("Bruno", "185.987.432-76", "002", "Secretaria de Educação", 1500, "Mestrado", "Portugês", 28, 2);

            Estagiario estagiario1 = new Estagiario("Douglas","185.987.432-76","01897","Secretaria de Educação",450);
            Estagiario estagiario2 = new Estagiario("Karina","185.547.432-76","01898","Secretaria de Educação",450);
            Estagiario estagiario3 = new Estagiario("Juliana","185.456.432-76","01899","Secretaria de Educação",450);

            Coordenador cordenador1 = new Coordenador("José", "234.876.143-34", "005", "Secretaria de Educação", 3000);
            System.out.println("Cordenador 1");
            cordenador1.adicionarProfessor(professor1);
            cordenador1.adicionarProfessor(professor2);
            cordenador1.adicionarProfessor(professor3);
            cordenador1.adicionarProfessor(professor4);
            cordenador1.adicionarProfessor(professor5);
            cordenador1.adicionarProfessor(professor6);
            System.out.println();

            //mostra o nome dos professores cordenados
            cordenador1.professoresCoordenados();
            //mostra nome da turma do professor
            professor1.adicionarTurma(turma1);
            professor1.exibirTurmas();

            System.out.println("Quantidade de professores do Cordenador 1: " + cordenador1.quantProfessoresSupervisionados()+" Professores ");

            System.out.println();
            //salario do professor antes do  reajuste
            System.out.println("Salário professor sem reajuste: " + professor1.getSalario());
            //salario do professor reajustado
            System.out.println("Salário professor reajustado: " + financeiro.aumentoSalarioFaixa2(professor1));
            System.out.println();
            //salario do Coordenador antes do  reajuste
            System.out.println("Salário coordenador sem reajuste: " + cordenador1.getSalario());
            //salario do Cordenador reajustado
            System.out.println("Salário coordenador reajustado: " + financeiro.aumentoSalarioFaixa1(cordenador1));
            System.out.println();
            //salafio Funcionário Administrativo antes do reajuste
            System.out.println("Salário Funcionário Administrativo sem reajuste: " + funcionario1.getSalario());
            //salario do Funcionário Administrativo reajustado
            System.out.println("Salário Funcionário Administrativo reajustado: " + financeiro.aumentoSalarioFaixa2(funcionario1));
            System.out.println();
            //adicionar estágiarios ao professor
            professor1.adicionarEstagiario(estagiario1);
            professor1.adicionarEstagiario(estagiario2);
            //exibir estagiarios do professor
            professor1.exibirEstagiarios();
            //tentar adicionar mais um estagiário
            professor1.adicionarEstagiario(estagiario3);

            financeiro.reembolsoDespesas(professor1);
            financeiro.reembolsoDespesas(estagiario1);
            financeiro.reembolsoDespesas(cordenador1);





        }
    }
}
