/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.edu.pe.service;

import com.cibertec.edu.pe.interfaces.IUbigeoService;
import com.cibertec.edu.pe.modelo.Sede;
import com.cibertec.edu.pe.modelo.Ubigeo;
import com.cibertec.edu.pe.repository.ISedeRepository;
import com.cibertec.edu.pe.repository.IUbigeoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafhael
 */
@Service
public class UbigeoService implements IUbigeoService{
    @Autowired
    private IUbigeoRepository _repository;
    
    @Override
    public List<Ubigeo> findAll() throws Exception {
        try {
            return _repository.findAll();
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Ubigeo findById(Long id) throws Exception {
        try {
            return _repository.findById(id).get();
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override    
    public Ubigeo save(Ubigeo entity) throws Exception {
        try {
            return _repository.save(entity);
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Ubigeo update(Ubigeo entity) throws Exception {
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
