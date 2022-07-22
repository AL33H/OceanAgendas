package br.com.OceanAgendas.service;

import java.util.List;

public interface GenericCrud<T> {

    List<T> findAll();

    T findById(Long Id);

    T save(T t);

    void delete(T t);

}
