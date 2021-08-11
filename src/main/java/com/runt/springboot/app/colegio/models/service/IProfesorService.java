package com.runt.springboot.app.colegio.models.service;

import java.util.List;

import com.runt.springboot.app.colegio.models.enity.Profesor;


public interface IProfesorService {
	public List<Profesor> findAll();

	public Profesor findById(Long id);

	public Profesor save(Profesor colegio);

	public void delete(Long id);
}
