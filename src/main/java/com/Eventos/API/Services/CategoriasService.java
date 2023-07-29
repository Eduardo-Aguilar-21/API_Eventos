package com.Eventos.API.Services;

import com.Eventos.API.Models.CategoriasModel;
import com.Eventos.API.Repositories.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriasService {
    @Autowired
    CategoriasRepository categoriasRepository;

    public List<CategoriasModel> GetAllCategories(){
        return categoriasRepository.findAll();
    }

    public Optional<CategoriasModel> GetByIDCategory(Long id){
        return categoriasRepository.findById(id);
    }

    public CategoriasModel CreateCategory(CategoriasModel categoriasModel){
        return categoriasRepository.save(categoriasModel);
    }
}
