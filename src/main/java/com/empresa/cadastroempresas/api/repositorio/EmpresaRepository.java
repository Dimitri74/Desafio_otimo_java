package com.empresa.cadastroempresas.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.cadastroempresas.api.model.Empresa;
import com.empresa.cadastroempresas.api.repositorio.empresa.EmpresaRepositoryQuery;

/**
 * @author Marcus Dimitri
 *
 */
public interface EmpresaRepository extends JpaRepository<Empresa, Long> , EmpresaRepositoryQuery {

}