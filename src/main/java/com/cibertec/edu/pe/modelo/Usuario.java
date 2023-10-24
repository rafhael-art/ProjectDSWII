/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.edu.pe.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
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
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Nombre;
    private String Apellidos;
    private String TipoDocumento;
    private String NumeroDocumento;
    private String Direccion;
    private int Edad;
  
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdSede", referencedColumnName = "Id")
    private Sede sede;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdUbigeo", referencedColumnName = "Id")
    private Ubigeo ubigeo;
    
    
    @ManyToMany
    @JoinTable(name  = "User_roles", 
    joinColumns = @JoinColumn(name = "UserId", referencedColumnName = "Id"), 
    inverseJoinColumns = @JoinColumn(name = "RolId",referencedColumnName = "Id"))
    private Set<Rol> roles;
    
    
    @ManyToMany
    @JoinTable(name  = "User_Seccion", 
    joinColumns = @JoinColumn(name = "UserId", referencedColumnName = "Id"), 
    inverseJoinColumns = @JoinColumn(name = "SeccionId",referencedColumnName = "Id"))
    private Set<Seccion> secciones;
    
    @ManyToMany
    @JoinTable(name  = "User_Curso", 
    joinColumns = @JoinColumn(name = "UserId", referencedColumnName = "Id"), 
    inverseJoinColumns = @JoinColumn(name = "CursoId",referencedColumnName = "Id"))
    private Set<Curso> cursos;
}
