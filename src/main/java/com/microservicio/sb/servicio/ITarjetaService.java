package com.microservicio.sb.servicio;

import java.util.List;

import com.microservicio.sb.entities.Tarjeta;

public interface ITarjetaService {

	public Tarjeta get(long id);
	public List<Tarjeta> getAll();
	public void post(Tarjeta tarjeta);
	public void put(Tarjeta tarjeta,long id);
	public void delete(long id);
}
