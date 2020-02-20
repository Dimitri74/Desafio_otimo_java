package com.empresa.cadastroempresas.api.model;

public enum TipoEmpresa {

	M ("MATRIZ"),
	F ("FILIAL");

	private String tipo;

	private TipoEmpresa(String tipo) {

		this.tipo = tipo;

	}

	public String getTipo() {
		return tipo;
	}
	
	




}
