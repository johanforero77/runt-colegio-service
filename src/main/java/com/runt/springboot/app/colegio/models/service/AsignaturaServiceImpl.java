package com.runt.springboot.app.colegio.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.springboot.app.colegio.models.dao.AsignaturaDao;
import com.runt.springboot.app.colegio.models.enity.Asignatura;

@Service
public class AsignaturaServiceImpl implements IAsignaturaService{

	@Autowired
	AsignaturaDao asignaturaDao;
	
	@Override
	public Asignatura findById(Long id) {
		return asignaturaDao.findById(id).orElse(null);
	}
	
}
