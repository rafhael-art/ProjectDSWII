/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.edu.pe.service;

import com.cibertec.edu.pe.interfaces.IRolService;
import com.cibertec.edu.pe.modelo.RespuestasIncorrectas;
import com.cibertec.edu.pe.modelo.Rol;
import com.cibertec.edu.pe.repository.IRespuestasIncorrectasRepository;
import com.cibertec.edu.pe.repository.IRolRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafhael
 */
@Service
public class RolService implements IRolService{

    @Autowired
    private IRolRepository _repository;
    
    @Override
    public List<Rol> findAll() throws Exception {
        try {
            return _repository.findAll();
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Rol findById(Long id) throws Exception {
        try {
            return _repository.findById(id).get();
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override    
    public Rol save(Rol entity) throws Exception {
        try {
            return _repository.save(entity);
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Rol update(Rol entity) throws Exception {
        try {
            return _repository.save(entity);
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Boolean delete(Long id) throws Exception {
        try {
            _repository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }
    
}
