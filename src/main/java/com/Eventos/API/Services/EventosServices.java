package com.Eventos.API.Services;

import com.Eventos.API.Models.EventosModel;
import com.Eventos.API.Repositories.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventosServices {
    @Autowired
    EventosRepository eventosRepository;

    public List<EventosModel> GetAllEvento(){
        return eventosRepository.findAll();
    }

    public Optional<EventosModel> GetByIDEvento(Long id){
        return eventosRepository.findById(id);
    }
}
