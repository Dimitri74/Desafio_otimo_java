/**
 * 
 */
package com.empresa.cadastroempresas.api.repositorio.projection;

import com.empresa.cadastroempresas.api.model.TipoEmpresa;

/**
 * @author Marcus Dimitri
 *
 */

//resumo das empresas retorna apenas o necessario na pesquisa.
public class ResumoEmpresas {
	
	private Long codigo;
	private String nome;
	private String  cnpj;
	private TipoEmpresa tipo;
	private String  razaoSocial;
	private String contato;
	private String email;
	
	
	
	public ResumoEmpresas(Long codigo, String nome, String cnpj, TipoEmpresa tipo, String razaoSocial, String contato,
			String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.tipo = tipo;
		this.razaoSocial = razaoSocial;
		this.contato = contato;
		this.email = email;
	}



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



	public String getRazaoSocial() {
		return razaoSocial;
	}



	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
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
	
	
	
	

}
