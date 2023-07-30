package com.Eventos.API.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EventoCategoria")
public class EventoCategoriaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "categoria", referencedColumnName = "id", nullable = false)
    private CategoriasModel categoriasModel;

    @ManyToOne
    @JoinColumn(name = "evento", referencedColumnName = "id", nullable = false)
    private EventosModel eventosModel;
}
