package it.epicode.be.godfather.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.be.godfather.model.Tavolo;
import it.epicode.be.godfather.model.Tavolo.Stato;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TavoloService {
	
	@Autowired
	private TavoloRepository tavoloRepo;
	
	public void save(Tavolo t) {
		tavoloRepo.save(t);
		log.info("Tavolo salvato con successo!");
	}
	
	public Tavolo findByNumeroTavolo(int num) {
		
		return tavoloRepo.findById(num).orElseThrow();
	}
	
	public Tavolo findByStato(Stato s) {
		
		return tavoloRepo.findByStato(s);
	}
	
	public void findByTableNumAndDelete(int num){
		Tavolo found = this.findByNumeroTavolo(num);
		tavoloRepo.delete(found);
	}
}
