package ListaA;


public class Estagiario extends Funcionario {

    double valorBolsa;

     public Estagiario(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double valorBolsa) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao);
        this.valorBolsa = valorBolsa;
    }

    public void exibirDadosEstagiario(){

        System.out.println("Nome: " + getNome());
    }

    public double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
}

