package ListaA;

import java.util.HashSet;
import java.util.Set;

public class Estagiarios extends Funcionarios {

    double valorBolsa;

    Set<Estagiarios> estagiarios = new HashSet<>();

    public Estagiarios(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double valorBolsa) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao);
        this.valorBolsa = valorBolsa;
    }

    public void adicionarEstagiario(Estagiarios estagiario){
        if (this.estagiarios.size()<2){
            this.estagiarios.add(estagiario);
        }else{
            System.out.println("Quantidade máxima de estagiários atingida");
        }
    }

    public void exibirEstagiarios(Professores professor){
        System.out.println("----Relação de Estagiários----");
        for (Estagiarios e : this.estagiarios){
            System.out.println(e.getNome() + " é estagiário do professor "+ professor.getNome());
        }
    }

    public double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
}

