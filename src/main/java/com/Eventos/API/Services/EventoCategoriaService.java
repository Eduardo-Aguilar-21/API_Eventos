package com.Eventos.API.Services;

import com.Eventos.API.Models.CategoriasModel;
import com.Eventos.API.Models.EventoCategoriaModel;
import com.Eventos.API.Models.EventosModel;
import com.Eventos.API.Repositories.EventoCategoriaRepository;
import com.Eventos.API.Repositories.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoCategoriaService {
    @Autowired
    EventoCategoriaRepository eventoCategoriaRepository;

    public List<EventoCategoriaModel> GetxCategory(Long categoriaId){
        CategoriasModel categoriasModel = new CategoriasModel();
        categoriasModel.setId(categoriaId);
      return eventoCategoriaRepository.findByCategoriasModel(categoriasModel);
    }

    public List<EventoCategoriaModel> GetAllEC (){
        return eventoCategoriaRepository.findAll();
    }

    public Optional<EventoCategoriaModel> GetByIdEC(Long id){
        return eventoCategoriaRepository.findById(id);
    }
}
