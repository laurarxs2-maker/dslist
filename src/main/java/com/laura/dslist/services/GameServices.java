package com.laura.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laura.dslist.dto.GameMinDTO;
import com.laura.dslist.entities.Game;
import com.laura.dslist.repositories.GameRepository;

@Service
public class GameServices {
	
	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
				
	}

}
