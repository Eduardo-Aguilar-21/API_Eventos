package com.Eventos.API.Repositories;

import com.Eventos.API.Models.RolesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RolesRepository extends JpaRepository<RolesModel, Long> {
}
