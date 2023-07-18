package com.Eventos.API.Repositories;

import com.Eventos.API.Models.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UsuariosRepository extends JpaRepository<UsuariosModel, Long> {
    Optional<UsuariosModel> findByUsername(String username);
}
