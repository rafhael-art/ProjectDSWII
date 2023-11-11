/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.edu.pe.service;

import com.cibertec.edu.pe.interfaces.IUsuarioService;
import com.cibertec.edu.pe.modelo.Ubigeo;
import com.cibertec.edu.pe.modelo.Usuario;
import com.cibertec.edu.pe.repository.IUbigeoRepository;
import com.cibertec.edu.pe.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafhael
 */
@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private IUsuarioRepository _repository;
    
    @Override
    public List<Usuario> findAll() throws Exception {
        try {
            return _repository.findAll();
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Usuario findById(Long id) throws Exception {
        try {
            return _repository.findById(id).get();
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override    
    public Usuario save(Usuario entity) throws Exception {
        try {
            return _repository.save(entity);
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Usuario update(Usuario entity) throws Exception {
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

    @Override
    public Usuario findByEmail(String email) {
        try {
            var user =  _repository.findByEmail(email);
            return user;
        } catch (Exception e) {
            return null;
        }
    }
}
