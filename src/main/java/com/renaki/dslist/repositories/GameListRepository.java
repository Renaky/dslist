package com.renaki.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renaki.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	

}
