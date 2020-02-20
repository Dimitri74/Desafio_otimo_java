/**
 * 
 */
package com.empresa.cadastroempresas.api.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.empresa.cadastroempresas.api.model.Empresa;
import com.empresa.cadastroempresas.api.repositorio.filtro.EmpresaFiltro;
import com.empresa.cadastroempresas.api.repositorio.EmpresaRepository;
import com.empresa.cadastroempresas.api.service.EmpresaService;

/**
 * @author Marcus Dimitri
 *
 */
@RestController
@RequestMapping("/empresas")
public class EmpresaResource {


	@Autowired
	private EmpresaRepository empresaRepository;

	@Autowired
	private EmpresaService empresaService;

	@GetMapping
	public Page<Empresa> pesquisar(EmpresaFiltro empresaFiltro , Pageable pageable){

		return empresaRepository.filtrar(empresaFiltro,pageable);

	}


	@GetMapping(params = "resumo")
	public Page<Empresa> resumir(EmpresaFiltro   empresaFiltro, Pageable pageable) {
		return empresaRepository.filtrar(empresaFiltro, pageable);
	}

	@PostMapping
	public ResponseEntity<Empresa> criar(@Valid @RequestBody Empresa empresa, HttpServletResponse response) {
		Empresa empresaSalva = empresaRepository.save(empresa);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
				.buildAndExpand(empresaSalva.getCodigo()).toUri();
		response.setHeader("Location", uri.toASCIIString());

		return ResponseEntity.created(uri).body(empresaSalva);
	}

	@GetMapping("/{codigo}")
	public ResponseEntity<Empresa> buscarPeloCodigo(@PathVariable Long codigo) {
		return this.empresaRepository.findById(codigo)
				.map(categoria -> ResponseEntity.ok(categoria))
				.orElse(ResponseEntity.notFound().build());

	}

	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public void remover(@PathVariable Long codigo) {
		Empresa empresa = new Empresa();
		empresa.setCodigo(codigo);
		this.empresaRepository.delete(empresa);
	}

	@PutMapping("/{codigo}")
	public ResponseEntity<Empresa> atualizar(@PathVariable Long codigo, @Valid @RequestBody Empresa empresa) {
		Empresa empresaSalva = empresaService.atualizar(codigo, empresa);
		return ResponseEntity.ok(empresaSalva);
	}


}
