package devs.condominio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "porteiro")
public class Porteiro extends Funcionario implements metodos{
    private String dataInicioAtividade;


    //construtor


    public Porteiro(String nome, String cpf, String rg, String dataNascimento, String telefone, String email,
                    String nacionalidade, String dataInicioAtividade) {
        super(nome, cpf);
        this.dataInicioAtividade = dataInicioAtividade;
    }



    //getters e setters

    public String getNome() {
        return super.getNome();
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public String getCpf() {
        return super.getCpf();
    }

    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    public String getRg() {
        return super.getRg();
    }

    public void setRg(String rg) {
        super.setRg(rg);
    }

   
    public String getTelefone() {
        return super.getTelefone();
    }

    public void setTelefone(String telefone) {
        super.setTelefone(telefone);
    }

    public String getEmail() {
        return super.getEmail();
    }

    public void setEmail(String email) {
        super.setEmail(email);
    }

    
    public String getDataInicioAtividade() {
        return dataInicioAtividade;
    }

    public void setDataInicioAtividade(String dataInicioAtividade) {
        this.dataInicioAtividade = dataInicioAtividade;
    }


    @Override
    public void cadastrar() {

    }

    @Override
    public void atualizar() {

    }

    @Override
    public void excluir() {

    }

    @Override
    public void consultar() {

    }

    @Override
    public void regEntrada() {

    }

    @Override
    public void regSaida() {

    }



	@Override
	public boolean autentica(String login, String senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
