package br.com.douglasbello.dslist.controllers;

import java.util.List;

import br.com.douglasbello.dslist.dto.GameDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.douglasbello.dslist.services.GameService;
import br.com.douglasbello.dslist.dto.GameMinDTO;

@RestController
@RequestMapping(value = "/games")
class GameController {

    private final GameService gameService;

    GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }
}