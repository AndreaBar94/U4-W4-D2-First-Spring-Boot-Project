package dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.MenuItemImpl;
import entities.Tavolo;

@Repository
public interface MenuItemImplRepository extends JpaRepository<MenuItemImpl, Integer>{
	
	MenuItemImpl findMenuItemById(long id);
	
}
