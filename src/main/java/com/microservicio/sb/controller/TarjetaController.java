package com.microservicio.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.sb.dao.Ejemplo;
import com.microservicio.sb.entities.Tarjeta;
import com.microservicio.sb.servicio.ITarjetaService;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/tarjetacontroller")
public class TarjetaController {

	@Autowired
	private ITarjetaService tService;
	@Autowired
	private Ejemplo e;

	@GetMapping("/todastarjetas")
//	@HystrixCommand(fallbackMethod = "homeRespaldo")
	public List<Tarjeta> getAllTarjetas() {
		System.out.println("Entro al producer");
		return tService.getAll();
	}

	@GetMapping("/tarjeta/{id}")
//	@HystrixCommand(fallbackMethod = "homeRespaldo")
	public Tarjeta getOne(@PathVariable(value = "id") long id) {
		return tService.get(id);
	}

	@GetMapping("/tarjetaporid/{id}")
//	@HystrixCommand(fallbackMethod = "homeRespaldo")
	public Tarjeta getIdt(@PathVariable(value = "id") long id) {
		return e.findUserByS(id);
	}

	public String homeRespaldo() {
		return "se a producido un error por favor intentalo de nuevo";
	}
}
