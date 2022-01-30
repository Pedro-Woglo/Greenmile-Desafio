package br.com.greenmile.rotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.greenmile.rotas.model.Rota;

@Repository
public interface RotaRepository extends JpaRepository<Rota, Long>{

}
