package com.Eventos.API.Repositories;

import com.Eventos.API.Models.CategoriasModel;
import com.Eventos.API.Models.EventoCategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventoCategoriaRepository extends JpaRepository<EventoCategoriaModel, Long> {
    List<EventoCategoriaModel> findByCategoriasModel(CategoriasModel categoriasModel);
}
