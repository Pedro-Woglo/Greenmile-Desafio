package br.com.greenmile.rotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import br.com.greenmile.rotas.model.Rota;
import br.com.greenmile.rotas.service.RotaService;

@RestController
@RequestMapping("/routes")
public class RotasController {
	
	@Autowired
	private RotaService service;
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<List<Rota>> lista() {
		return ResponseEntity.ok().body(service.buscarTodos()); 
	}
	
	@PostMapping("/route")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Rota cadastrar(@RequestBody Rota rota) {
		return service.salvar(rota);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Rota atualizar(@PathVariable Long id, @RequestBody Rota rota){
		return service.atualizar(id, rota);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void excluir(@PathVariable Long id) {
		service.excluir(id);
	}

}
