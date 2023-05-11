package br.com.douglasbello.dslist.controllers;

import br.com.douglasbello.dslist.dto.GameListDTO;
import br.com.douglasbello.dslist.services.GameListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    private final GameListService service;

    GameListController(GameListService service) {
        this.service = service;
    }

    @GetMapping
    public List<GameListDTO> findAll() {
        return service.findAll();
    }
}
