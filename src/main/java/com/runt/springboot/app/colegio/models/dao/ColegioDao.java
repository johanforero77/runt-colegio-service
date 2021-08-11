package com.runt.springboot.app.colegio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.runt.springboot.app.colegio.models.enity.Colegio;

public interface ColegioDao extends CrudRepository <Colegio, Long>{

}
