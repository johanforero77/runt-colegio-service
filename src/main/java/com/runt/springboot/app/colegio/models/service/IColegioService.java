package com.runt.springboot.app.colegio.models.service;

import java.util.List;

import com.runt.springboot.app.colegio.models.enity.Colegio;


public interface IColegioService {
	public List<Colegio> findAll();

	public Colegio findById(Long id);

	public Colegio save(Colegio colegio);

	public void delete(Long id);
}
