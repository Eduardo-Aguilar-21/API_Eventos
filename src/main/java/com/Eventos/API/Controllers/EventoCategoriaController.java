package com.Eventos.API.Controllers;

import com.Eventos.API.Models.EventoCategoriaModel;
import com.Eventos.API.Services.EventoCategoriaService;
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
@RequestMapping("api/ec")
public class EventoCategoriaController {
    @Autowired
    EventoCategoriaService eventoCategoriaService;

    @GetMapping("/eventoxcat/{id}")
    public List<EventoCategoriaModel> GetxCat(@PathVariable Long id){
        return eventoCategoriaService.GetxCategory(id);
    }

    @GetMapping
    public List<EventoCategoriaModel> GetAllEC(){
        return eventoCategoriaService.GetAllEC();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventoCategoriaModel> GetAllEcId(@PathVariable Long id){
        Optional<EventoCategoriaModel> ec = eventoCategoriaService.GetByIdEC(id);
        if(ec.isPresent()){
            return new ResponseEntity<>(ec.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
