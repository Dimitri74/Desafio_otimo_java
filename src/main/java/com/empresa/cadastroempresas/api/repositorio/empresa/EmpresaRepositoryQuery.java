/**
 * 
 */
package com.empresa.cadastroempresas.api.repositorio.empresa;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.empresa.cadastroempresas.api.model.Empresa;
import com.empresa.cadastroempresas.api.repositorio.filtro.EmpresaFiltro;
import com.empresa.cadastroempresas.api.repositorio.projection.ResumoEmpresas;

/**
 * @author Marcus Dimitri
 *
 */
public interface EmpresaRepositoryQuery {
	
	public Page<Empresa> filtrar(EmpresaFiltro  empresaFiltro, Pageable pageable);
	
	
	/*//Criteria para o resumo 
		public Page<ResumoEmpresas> resumir( EmpresaFiltro  empresaFiltro, Pageable pageable);*/

}
