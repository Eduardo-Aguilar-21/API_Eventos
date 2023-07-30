package com.Eventos.API.Controllers;

import com.Eventos.API.Models.EventosModel;
import com.Eventos.API.Services.EventosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/eventos")
public class EventosController {
    @Autowired
    EventosServices eventosServices;

    @GetMapping
    public List<EventosModel> GetAllEvento(){
        return eventosServices.GetAllEvento();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventosModel> getEventoById(@PathVariable Long id) {
        Optional<EventosModel> evento = eventosServices.GetByIDEvento(id);

        if (evento.isPresent()) {
            return new ResponseEntity<>(evento.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
