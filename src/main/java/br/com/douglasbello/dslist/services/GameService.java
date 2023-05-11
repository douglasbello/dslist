package br.com.douglasbello.dslist.services;

import java.util.List;

import br.com.douglasbello.dslist.dto.GameDTO;
import br.com.douglasbello.dslist.projections.GameMinProjection;
import org.springframework.stereotype.Service;

import br.com.douglasbello.dslist.dto.GameMinDTO;
import br.com.douglasbello.dslist.entities.Game;
import br.com.douglasbello.dslist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(GameMinDTO::new).toList();
    }
}
