package ListaA;

import java.util.HashSet;
import java.util.Set;

public class Coordenadores extends FuncionariosAssalariados{
    //atributos
    private Set<Professores> professoresSupervisionados = new HashSet<>();

    //contrutor
    public Coordenadores(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
    }

    //métodos
    public void adicionarProfessor(Professores professor){
        if (this.professoresSupervisionados.size()<10){
            this.professoresSupervisionados.add(professor);
        }else{
            System.out.println("Quantidade máxima de professores atingida");
        }
    }

    public int quantProfessoresSupervisionados(){
        return professoresSupervisionados.size();
    }

    public void professoresCoordenados() {
        System.out.println("Lista de Professores Coordenados:");
        for(Professores p:professoresSupervisionados){
            System.out.println("Nome do professor supervisionado: " + p.getNome());
        }
    }

    //Getter e Setter
    public Set<Professores> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(Set<Professores> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}
