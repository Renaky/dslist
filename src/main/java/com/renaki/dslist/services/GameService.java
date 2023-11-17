package com.renaki.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renaki.dslist.dto.GameDTO;
import com.renaki.dslist.dto.GameMinDTO;
import com.renaki.dslist.entities.Game;
import com.renaki.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional
	public List<GameMinDTO> findAll(){
	 List<Game> result  = gameRepository.findAll();
	 List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
	 return dto;
	
	}

}
