package devs.condominio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "inquilino")
public class Inquilino extends Pessoa implements metodos{
    protected String dataEntradaCondominio;
    protected String dataSaidaCondominio;



    //Construtor
    public Inquilino(String nome, String cpf, String rg, String dataNascimento, String telefone, String email,
                     String nacionalidade, String dataEntradaCondominio,
                     String dataSaidaCondominio) {
        super(nome, cpf, rg, telefone, email);
        this.dataEntradaCondominio = dataEntradaCondominio;
        this.dataSaidaCondominio = dataSaidaCondominio;
    }


    //Getters and Setters

    public String getDataEntradaCondominio() {
        return dataEntradaCondominio;
    }

    public void setDataEntradaCondominio(String dataEntradaCondominio) {
        this.dataEntradaCondominio = dataEntradaCondominio;
    }

    public String getDataSaidaCondominio() {
        return dataSaidaCondominio;
    }

    public void setDataSaidaCondominio(String dataSaidaCondominio) {
        this.dataSaidaCondominio = dataSaidaCondominio;
    }

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

    public String getDataNascimento() {
        return super.getDataNascimento();
    }

    public void setDataNascimento(String dataNascimento) {
        super.setDataNascimento(dataNascimento);
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

    public String getNacionalidade() {
        return super.getNacionalidade();
    }

    public void setNacionalidade(String nacionalidade) {
        super.setNacionalidade(nacionalidade);
    }



    //Métodos


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
