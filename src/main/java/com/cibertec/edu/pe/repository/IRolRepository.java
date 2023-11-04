/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cibertec.edu.pe.repository;

import com.cibertec.edu.pe.modelo.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rafhael
 */
public interface IRolRepository extends JpaRepository<Rol, Long>{
    
}
