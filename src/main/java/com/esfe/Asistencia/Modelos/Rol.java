package com.esfe.Asistencia.Modelos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer Id;

    @NotBlank(message = "El nombre del rol es rquerido")
    private String Nombre;

    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
