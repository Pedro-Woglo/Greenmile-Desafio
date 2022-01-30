package br.com.greenmile.rotas.service;

import java.util.List;

import br.com.greenmile.rotas.model.Rota;

public interface RotaService {

	public Rota salvar(Rota rota);
	public List<Rota> buscarTodos();
	public void excluir(Long id);
	public Rota atualizar(Long id, Rota rota);

}
