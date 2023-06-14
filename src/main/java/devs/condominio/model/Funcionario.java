package devs.condominio.model;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Funcionario implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected UUID id;
	protected String nome;
	protected String telefone;
	protected String cpf;
	protected String rg;
	protected String email;
	
	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	
	
	
	
	//Getter e Setter
	
	

	public String getNome() {
		return nome;
	}

	public UUID getId() {
		return id;
	}






	public void setId(UUID id) {
		this.id = id;
	}






	public static long getSerialversionuid() {
		return serialVersionUID;
	}






	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
	
	
}
