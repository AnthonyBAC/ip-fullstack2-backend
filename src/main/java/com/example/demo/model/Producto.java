package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCTO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {
    @Id
    @Column(name = "PRODUCTO_ID")
    private Long id;
    
    @Column(name = "NOMBRE_PRODUCTO")
    private String nombre;
    
    @Column(name = "PRECIO_PRODUCTO")
    private Integer precio;
    
    @Column(name = "CATEGORIA")
    private String categoria;
    
    @Column(name = "IMAGEN")
    private String imagen;
}