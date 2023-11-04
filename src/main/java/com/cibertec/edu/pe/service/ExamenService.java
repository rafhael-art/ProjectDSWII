/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.edu.pe.service;

import com.cibertec.edu.pe.interfaces.IExamenService;
import com.cibertec.edu.pe.modelo.Curso;
import com.cibertec.edu.pe.modelo.Examen;
import com.cibertec.edu.pe.repository.ICursoRepository;
import com.cibertec.edu.pe.repository.IExamenRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafhael
 */
@Service
public class ExamenService implements IExamenService{

    @Autowired
    private IExamenRepository _repository;
    
    @Override
    public List<Examen> findAll() throws Exception {
        try {
            return _repository.findAll();
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Examen findById(Long id) throws Exception {
        try {
            return _repository.findById(id).get();
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override    
    public Examen save(Examen entity) throws Exception {
        try {
            return _repository.save(entity);
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Examen update(Examen entity) throws Exception {
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
