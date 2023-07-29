package com.Eventos.API.Controllers;

import com.Eventos.API.Models.UsuariosModel;
import com.Eventos.API.Services.UsuariosService;
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
@RequestMapping("api/usuarios")
public class UsuariosController {
    @Autowired
    UsuariosService usuariosService;

    @GetMapping("/saludo")
    public String Hola(){
        return "Holamundo";
    }
    @GetMapping("/info/{username}")
    public ResponseEntity<UsuariosModel> infoTra(@PathVariable("username") String username){
        Optional<UsuariosModel> trabajadores = usuariosService.ListarInfo(username);
        if (trabajadores.isPresent()){
            return new ResponseEntity<>(trabajadores.get(), HttpStatus.OK);
        }
        return null;
    }

    //CRUD
    @GetMapping
    public List<UsuariosModel> GetAllUser(){
        return usuariosService.GetUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuariosModel> GetUserId(@PathVariable Long id){
        Optional<UsuariosModel> user = usuariosService.GetUserId(id);
        if (user.isEmpty()){
            return new ResponseEntity<>(user.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
