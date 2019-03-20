package com.microservicio.sb.dao;

import org.springframework.data.repository.CrudRepository;

import com.microservicio.sb.entities.Tarjeta;

public interface ITarjetaDAO extends CrudRepository<Tarjeta, Long>{

}
