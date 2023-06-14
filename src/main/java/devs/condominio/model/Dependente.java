package devs.condominio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "dependente")
public class Dependente extends Pessoa implements metodos {
	
    public Dependente(String nome, String cpf, String rg, String telefone, String email
			) {
		super(nome, cpf, rg, telefone, email);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void cadastrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void regEntrada() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void regSaida() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean autentica(String login, String senha) {
		// TODO Auto-generated method stub
		return false;
	}



}
