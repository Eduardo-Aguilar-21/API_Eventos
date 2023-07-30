package com.Eventos.API.Controllers;

import com.Eventos.API.Models.CategoriasModel;
import com.Eventos.API.Services.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/categorias")
public class CategoriasController {
    @Autowired
    CategoriasService categoriasService;

    @GetMapping
    public List<CategoriasModel> GetAllCategory(){
        return categoriasService.GetAllCategories();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriasModel> GetIDCategory(@PathVariable Long id){
        Optional<CategoriasModel> category = categoriasService.GetByIDCategory(id);
        return new ResponseEntity<>(category.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CategoriasModel> CreateCategory(@RequestBody CategoriasModel categoriasModel){
        CategoriasModel ccategoria = categoriasService.CreateCategory(categoriasModel);
        return new ResponseEntity<>(ccategoria, HttpStatus.OK);
    }
}
