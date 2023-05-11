package br.com.douglasbello.dslist.services;

import br.com.douglasbello.dslist.dto.GameListDTO;
import br.com.douglasbello.dslist.entities.GameList;
import br.com.douglasbello.dslist.repositories.GameListRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository repository;

    public GameListService(GameListRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> list = repository.findAll();
        return list.stream().map(GameListDTO::new).toList();
    }

}
