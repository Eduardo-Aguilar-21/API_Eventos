package com.Eventos.API.Request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserDTO {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String nombre;
    private String apellido;
    private Long roles;
    private Boolean estado;
}