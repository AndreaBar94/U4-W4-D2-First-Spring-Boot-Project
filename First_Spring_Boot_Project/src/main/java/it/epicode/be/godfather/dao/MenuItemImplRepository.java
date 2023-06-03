package it.epicode.be.godfather.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicode.be.godfather.model.MenuItemImpl;
import it.epicode.be.godfather.model.Tavolo;

@Repository
public interface MenuItemImplRepository extends JpaRepository<MenuItemImpl, Integer>{
	
	MenuItemImpl findMenuItemById(long id);
	
}
