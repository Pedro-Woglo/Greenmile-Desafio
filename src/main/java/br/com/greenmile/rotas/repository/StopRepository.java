package br.com.greenmile.rotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.greenmile.rotas.model.Stop;

@Repository
public interface StopRepository extends JpaRepository<Stop, Long>{

}
