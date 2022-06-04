package br.com.OceanAgendas.service;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GenericCrud<T> {

    ResponseEntity<List<T>> findAll();

    ResponseEntity<T> findById(Long Id);

    ResponseEntity<T> save(T t);

    ResponseEntity<T> delete(T t);

}
