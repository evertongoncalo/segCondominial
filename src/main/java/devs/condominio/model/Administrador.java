package devs.condominio.model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="administrador")
public class Administrador extends Funcionario implements metodos{


    private String dataInicioAtividade;


    //construtor

    public Administrador(String nome, String cpf, String rg, String telefone, String email,
                          String dataInicioAtividade) {
        super(nome, cpf);
        this.dataInicioAtividade = dataInicioAtividade;
    }


    //getters e setters


    public String getDataInicioAtividade() {
        return dataInicioAtividade;
    }


	public void setDataInicioAtividade(String dataInicioAtividade) {
        this.dataInicioAtividade = dataInicioAtividade;
    }


    //Metodos

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
