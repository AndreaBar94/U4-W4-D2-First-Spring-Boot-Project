package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Tavolo;
import entities.Tavolo.Stato;

@Service
public class TavoloService {
	
	@Autowired
	private TavoloRepository tavoloRepo;
	
	public void create(Tavolo t) {
		tavoloRepo.save(t);
	}
	
	public Tavolo findByTableNumber(int num) {
		
		return tavoloRepo.findById(num).orElseThrow();
	}
	
	public Tavolo findByTableState(Stato s) {
		
		return tavoloRepo.findByState(s);
	}
	
	public void findByTableNumAndDelete(int num){
		Tavolo found = this.findByTableNumber(num);
		tavoloRepo.delete(found);
	}
}
