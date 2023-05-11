package br.com.douglasbello.dslist.controllers;

import br.com.douglasbello.dslist.dto.GameListDTO;
import br.com.douglasbello.dslist.dto.GameMinDTO;
import br.com.douglasbello.dslist.services.GameListService;
import br.com.douglasbello.dslist.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    private final GameListService gameListService;

    private final GameService gameService;

    GameListController(GameListService gameListService, GameService gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }
}
