package ListaA;

import java.util.Scanner;

public class Financeiro {


    //implementando OCP
    public double aumentoSalario(FuncionarioAssalariado funcionario,TabelaSalario tabela) {
        funcionario.setSalario(funcionario.getSalario()+(funcionario.getSalario()* tabela.faixaAjusteSalarial()));
        return funcionario.getSalario();
    }

    //versão anterios sem implementação de OCP

//    public double aumentoSalarioFaixa2(FuncionarioAssalariado funcionario) {
//        funcionario.setSalario(funcionario.getSalario()+(funcionario.getSalario()*0.1));
//        return funcionario.getSalario();
//    }
//
//    public double aumentoSalarioFaixa1(FuncionarioAssalariado funcionario) {
//        funcionario.setSalario(funcionario.getSalario() + (funcionario.getSalario() * 0.05));
//        return funcionario.getSalario();
//    }

        protected void reembolsoDespesas(Funcionario funcionario) {
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("----Solicitação de Reembolso----");
            System.out.println();
            System.out.print("Digite o valor total das despesas: R$ ");
            String valorDespesas = input.nextLine();
            System.out.print("Digite o nome do bando:");
            String nomeDoBando = input.nextLine();
            System.out.print("Digite o número da agência:");
            String numeroDaAgencia = input.nextLine();
            System.out.print("Digite o número da conta:");
            String numeroDaConta = input.nextLine();
            System.out.println();
            System.out.println("-----Reembolso efetuado com sucesso-----");
            System.out.println("Nome do favorecido: " + funcionario.getNome());
            System.out.println("Banco: " + nomeDoBando);
            System.out.println("Agência nº " + numeroDaAgencia + " - Conta nº " + numeroDaConta);
            System.out.println("Valor do reembolso creditado: R$ " + valorDespesas);
        }
}
