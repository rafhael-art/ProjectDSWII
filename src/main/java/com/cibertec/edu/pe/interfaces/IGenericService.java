/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cibertec.edu.pe.interfaces;

import java.util.List;

/**
 *
 * @author rafhael
 * @param <T>
 * @param <ID>
 */
public interface IGenericService<T,ID> {
    public List<T> findAll() throws Exception;
    public T findById(ID id) throws Exception;
    public T save(T entity) throws Exception;
    public T update(T entity) throws Exception;
    public Boolean delete(ID id) throws Exception;
}
