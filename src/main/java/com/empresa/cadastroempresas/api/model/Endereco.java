/**
 * 
 */
package com.empresa.cadastroempresas.api.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 * @author Marcus Dimitri
 *
 */
@Embeddable
public class Endereco {
	
	@NotNull
	private String logradouro;
	private String complemento;
	@NotNull
	private String bairro;
	@NotNull
	private String cep;
	@NotNull
	private String cidade;
	@NotNull
	private String estado;
	
	
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	

}
