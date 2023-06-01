package dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Tavolo;
import entities.Tavolo.Stato;

@Repository
public interface TavoloRepository extends JpaRepository<Tavolo, Integer>{
	
	Optional<Tavolo> findByTableNumber(int numeroTavolo);
	
	Tavolo findByState(Stato stato);
}
