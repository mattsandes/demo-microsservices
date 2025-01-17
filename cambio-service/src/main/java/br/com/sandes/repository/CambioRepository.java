package br.com.sandes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sandes.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{
	
	Cambio findByFromAndTo(String from, String to);
}
