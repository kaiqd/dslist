package com.kaiq.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaiq.dslist.dto.GameMinDTO;
import com.kaiq.dslist.entities.Game;
import com.kaiq.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameMinDTO::new).toList();
	}
}