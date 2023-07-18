package com.Eventos.API.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Usuarios")
public class UsuariosModel {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String nombre;
    private String apellido;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "rol_id", referencedColumnName = "id", nullable = false)
    private RolesModel rolesModel;
}
