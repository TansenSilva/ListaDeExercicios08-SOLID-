package ListaA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Professor extends FuncionarioAssalariado {

    Scanner input = new Scanner(System.in);
    //Atributos
    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;

    private Set<Estagiario> estagiarios = new HashSet<>();
    private Set<Turma> turmas = new HashSet<>();

    //Construtor
    public Professor(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int quantidadeDeAlunos, int quantidadeDeTurmas) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

    public void adicionarEstagiario(Estagiario estagiario){
        if (this.estagiarios.size()<2){
            this.estagiarios.add(estagiario);
        }else{
            System.out.println("Quantidade máxima de estagiários atingida");
        }
    }

    public void exibirEstagiarios(){
        System.out.println("----Relação de Estagiários----");
        System.out.println("Professor: " + getNome());
        System.out.println("---Estagiários---");
        for (Estagiario e : this.estagiarios){
            e.exibirDadosEstagiario();
        }
    }

    public void adicionarTurma(Turma turma){
        this.turmas.add(turma);
    }

    public void exibirTurmas() {
        System.out.println("Lista de Turmas:");
        System.out.println("Turma do professor: " + getNome());
        for(Turma t:this.turmas){

            t.exibirDadosTurma();
        }
    }


    //Getter e Setter
    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

}
