package devs.condominio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "sindico")
public class Sindico extends Funcionario implements metodos{
    private String dataMandato;

    //construtor


    public Sindico(String nome, String cpf, String rg, String dataNascimento, String telefone, String email,
                   String nacionalidade, String dataMandato) {
        super(nome, cpf);
        this.dataMandato = dataMandato;
    }


    //getters and setters

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

    
    public String getDataMandato() {
        return dataMandato;
    }

    public void setDataMandato(String dataMandato) {
        this.dataMandato = dataMandato;
    }




    //methods


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
