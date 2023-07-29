package com.Eventos.API.Services;

import com.Eventos.API.Models.UsuariosModel;
import com.Eventos.API.Repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {
    @Autowired
    UsuariosRepository usuariosRepository;

    public Optional<UsuariosModel> ListarInfo(String username){
        return usuariosRepository.findByUsername(username);
    }
    //CRUD

    public List<UsuariosModel> GetUsers(){
        return usuariosRepository.findAll();
    }

    public Optional<UsuariosModel> GetUserId(Long id){
        return usuariosRepository.findById(id);
    }

}
