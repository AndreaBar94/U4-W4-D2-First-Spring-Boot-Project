package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.MenuItemImpl;

@Service
public class MenuItemImplService {
	
	@Autowired
	private MenuItemImplRepository menuRepo;
	
	public void create(MenuItemImpl m) {
		menuRepo.save(m);
	}
	
	public MenuItemImpl findById(long id) {
		return menuRepo.findMenuItemById(id);
	}
	
	
	public void findByIdandDelete(long id) {
		MenuItemImpl found = this.findById(id);
		menuRepo.delete(found);
	}
}
