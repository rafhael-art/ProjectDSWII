/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.edu.pe.service;

import com.cibertec.edu.pe.interfaces.ICursoService;
import com.cibertec.edu.pe.modelo.Curso;
import com.cibertec.edu.pe.repository.ICursoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafhael
 */
@Service
public class CursoService implements ICursoService{

    @Autowired
    private ICursoRepository _repository;
    
    @Override
    public List<Curso> findAll() throws Exception {
        try {
            return _repository.findAll();
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Curso findById(Long id) throws Exception {
        try {
            return _repository.findById(id).get();
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override    
    public Curso save(Curso entity) throws Exception {
        try {
            return _repository.save(entity);
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Curso update(Curso entity) throws Exception {
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
