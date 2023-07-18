package com.Eventos.API.Repositories;

import com.Eventos.API.Models.CategoriasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<CategoriasModel, Long> {
}
