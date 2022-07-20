package ListaA;

import java.util.HashSet;
import java.util.Set;

public class Turma {
    private String nome;
    private int quantidadeDeAlunos;

    private Set<Turma> turma = new HashSet<>();


    public Turma(String nome, int quantidadeDeAlunos) {
        this.nome = nome;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public void adicionarTurma(Turma turma){
        this.turma.add(turma);
    }

    public void exibirTurmas(Professores professor) {
        System.out.println("Lista de Turmas:");
        for(Turma t:turma){
            System.out.println("Turma do professor: " + professor.getNome() + "\nNome da Turma: " + t.getNome());
        }
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
