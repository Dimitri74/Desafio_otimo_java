/**
 * 
 */
package com.empresa.cadastroempresas.api.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



/**
 * @author Marcus Dimitri
 * 
 *
 */
@Entity
@Table(name = "empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotNull
	private String nome; 
	
	@NotNull
	private String cnpj;
	
	
	
	public Empresa() {}
	
		
	
	public Empresa(Long codigo, @NotNull String nome, @NotNull String cnpj, TipoEmpresa tipo,
			@NotNull String razaoSocial, @NotNull String contato, @NotNull String email, Endereco endereco) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.tipo = tipo;
		this.razaoSocial = razaoSocial;
		this.contato = contato;
		this.email = email;
		this.endereco = endereco;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_empresa")
	private TipoEmpresa tipo;
	
	@NotNull
	@Column(name="razao_social")
	private String razaoSocial;
	
	@NotNull
	private String contato;
	
	@NotNull
	private String email;
	
		
	@Embedded
	private Endereco endereco;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public TipoEmpresa getTipo() {
		return tipo;
	}

	public void setTipo(TipoEmpresa tipo) {
		this.tipo = tipo;
	}

	public String getRazao_social() {
		return razaoSocial;
	}

	public void setRazao_social(String razao_social) {
		this.razaoSocial = razao_social;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empresa [codigo=" + codigo + ", nome=" + nome + ", cnpj=" + cnpj + ", tipo=" + tipo + ", razaoSocial="
				+ razaoSocial + ", contato=" + contato + ", email=" + email + ", endereco=" + endereco + "]";
	}
	
	
	
	
	

}
