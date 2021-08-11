package com.runt.springboot.app.colegio.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.runt.springboot.app.colegio.models.dao.ColegioDao;
import com.runt.springboot.app.colegio.models.enity.Colegio;

@Service
public class ColegioServiceImpl implements IColegioService {

	@Autowired
	private ColegioDao colegioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Colegio> findAll() {
		return (List<Colegio>) colegioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Colegio findById(Long id) {
		return colegioDao.findById(id).orElse(null);
	}

	@Override
	public Colegio save(Colegio colegio) {
		return colegioDao.save(colegio);
	}

	@Override
	public void delete(Long id) {
		colegioDao.deleteById(id);
	}

}
