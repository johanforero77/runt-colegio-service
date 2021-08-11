package com.runt.springboot.app.colegio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.runt.springboot.app.colegio.models.enity.Profesor;

public interface ProfesorDao extends CrudRepository <Profesor, Long>{

}
