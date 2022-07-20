package ListaA;

import java.util.HashSet;
import java.util.Set;

public class Turma {
    private String nome;
    private int quantidadeDeAlunos;


    public Turma(String nome, int quantidadeDeAlunos) {
        this.nome = nome;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public void exibirDadosTurma(){
        System.out.println("Nome da turma: " + getNome());
        System.out.println("Quantidade de alunos: " + getQuantidadeDeAlunos());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }
}
