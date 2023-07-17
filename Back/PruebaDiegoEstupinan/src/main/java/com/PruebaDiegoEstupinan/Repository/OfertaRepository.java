package com.PruebaDiegoEstupinan.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.PruebaDiegoEstupinan.Entity.Oferta;

@Repository
public interface OfertaRepository extends JpaRepository<Oferta, Long> {

	@Query("select d from Oferta d")
	public List<Oferta> Todos();
	
}
