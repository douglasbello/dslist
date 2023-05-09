package br.com.douglasbello.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.douglasbello.dslist.dto.GameMinDTO;
import br.com.douglasbello.dslist.entities.Game;
import br.com.douglasbello.dslist.repositories.GameRepository;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
