/**
 * 
 */
package com.empresa.cadastroempresas.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.empresa.cadastroempresas.api.model.Empresa;
import com.empresa.cadastroempresas.api.repositorio.EmpresaRepository;

/**
 * @author Marcus Dimitri
 *
 */
@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	
	
	public Empresa atualizar(Long codigo, Empresa empresa) {
		Empresa empresaSalva = this.empresaRepository.findById(codigo)
				 .orElseThrow(() -> new EmptyResultDataAccessException(1));
		
		BeanUtils.copyProperties(empresa, empresaSalva, "codigo");
		return empresaRepository.save(empresaSalva);
	}
	
	

}
