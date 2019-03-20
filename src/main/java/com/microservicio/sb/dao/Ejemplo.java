package com.microservicio.sb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.microservicio.sb.entities.Tarjeta;

public interface Ejemplo extends JpaRepository<Tarjeta, Long> {
	
	@Query("SELECT t FROM Tarjeta t WHERE t.id=:id")
	Tarjeta findUserByS(@Param("id") Long id);
	
	


}
