package com.runt.springboot.app.colegio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.springboot.app.colegio.models.enity.Asignatura;
import com.runt.springboot.app.colegio.models.enity.Colegio;
import com.runt.springboot.app.colegio.models.enity.Profesor;
import com.runt.springboot.app.colegio.models.service.IAsignaturaService;
import com.runt.springboot.app.colegio.models.service.IColegioService;
import com.runt.springboot.app.colegio.models.service.IProfesorService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ColegioController {

	@Autowired
	private IColegioService colegioService;

	@Autowired
	private IProfesorService profesorService;

	@Autowired
	private IAsignaturaService asignaturaService;

	@GetMapping("/listar-colegio")
	public List<Colegio> listarColegio() {
		return colegioService.findAll();
	}

	@GetMapping("/listar-profesores")
	public List<Profesor> listarProfesor() {
		return buscarProfesores(profesorService.findAll());
	}

	private List<Profesor> buscarProfesores(List<Profesor> profesores) {
		for (Profesor profe : profesores) {
			for (Asignatura asig : profe.getAsignaturas()) {
				Asignatura curso = asignaturaService.findById(asig.getId());
				asig.setGradoSalon(curso.getCurso().getGrado().toString() + "-" + curso.getCurso().getSalon());
			}
		}
		return profesores;
	}
}
