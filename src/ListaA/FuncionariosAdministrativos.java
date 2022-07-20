package ListaA;

public class FuncionariosAdministrativos extends FuncionariosAssalariados {
    //Atributos
    private String funcaoAdministrativa;
    private String senioridade;

    //construtor
    public FuncionariosAdministrativos(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }


    //Getter e Setter
    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

}
