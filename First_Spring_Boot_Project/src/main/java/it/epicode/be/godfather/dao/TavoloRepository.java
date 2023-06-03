package it.epicode.be.godfather.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicode.be.godfather.model.Tavolo;
import it.epicode.be.godfather.model.Tavolo.Stato;

@Repository
public interface TavoloRepository extends JpaRepository<Tavolo, Integer>{
	
	Optional<Tavolo> findByNumeroTavolo(int numeroTavolo);
	
	Tavolo findByStato(Stato stato);
}
