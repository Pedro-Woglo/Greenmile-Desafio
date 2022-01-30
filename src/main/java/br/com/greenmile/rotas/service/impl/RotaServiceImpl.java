package br.com.greenmile.rotas.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.greenmile.rotas.model.Rota;
import br.com.greenmile.rotas.repository.RotaRepository;
import br.com.greenmile.rotas.service.RotaService;

@Service
public class RotaServiceImpl implements RotaService {
	
	@Autowired
	private RotaRepository rotaRepository;
	
	@Override
	public Rota salvar(Rota rota){
		return rotaRepository.save(rota);
	}
	
	@Override
	public List<Rota> buscarTodos(){
		return rotaRepository.findAll();
	}
	
	@Override
	public Rota atualizar(Long id, Rota rota){
		Rota rotaPersistida = rotaRepository.findById(id).get();
		BeanUtils.copyProperties(rota, rotaPersistida, "id");
		return rotaRepository.save(rotaPersistida);
    }
	
    @Override
    public void excluir(Long id) {
    	rotaRepository.deleteById(id);
    }

}
