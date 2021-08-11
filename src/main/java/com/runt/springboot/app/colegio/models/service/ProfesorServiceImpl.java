package com.runt.springboot.app.colegio.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.runt.springboot.app.colegio.models.dao.ProfesorDao;
import com.runt.springboot.app.colegio.models.enity.Profesor;

@Service
public class ProfesorServiceImpl implements IProfesorService {

	@Autowired
	private ProfesorDao profesorDao;

	@Override
	@Transactional(readOnly = true)
	public List<Profesor> findAll() {
		return (List<Profesor>) profesorDao.findAll();
	}

	@Override
	public Profesor findById(Long id) {
		return null;
	}

	@Override
	public Profesor save(Profesor colegio) {
		return null;
	}

	@Override
	public void delete(Long id) {
		
	}



}
