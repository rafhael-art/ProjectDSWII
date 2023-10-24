/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.edu.pe.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.Date;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author rafhael
 */
@Getter
@Setter
@Entity
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "IdUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "IdSeccion")
    private Seccion seccion;

    @ManyToOne
    @JoinColumn(name = "IdCurso")
    private Curso curso;

    private String Descripcion;
    private Date FechaInicio;
    private Date FechaFin;
    private Boolean Realizado;
    @OneToMany(mappedBy = "examen")
    private Set<Pregunta> preguntas;

}
