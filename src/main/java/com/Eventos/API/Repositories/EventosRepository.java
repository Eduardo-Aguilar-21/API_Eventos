package com.Eventos.API.Repositories;

import com.Eventos.API.Models.EventosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventosRepository extends JpaRepository<EventosModel, Long> {
}
