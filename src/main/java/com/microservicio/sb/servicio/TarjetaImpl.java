package com.microservicio.sb.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.sb.dao.ITarjetaDAO;
import com.microservicio.sb.entities.Tarjeta;


@Service
public class TarjetaImpl implements ITarjetaService {

	
	@Autowired
	private ITarjetaDAO tDAO;
	
	@Override
	public Tarjeta get(long id) {
		// TODO Auto-generated method stub
		return tDAO.findById(id).get();
	}

	@Override
	public List<Tarjeta> getAll() {
		// TODO Auto-generated method stub
		return (List<Tarjeta>) tDAO.findAll();
	}

	@Override
	public void post(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		tDAO.save(tarjeta);
	}

	@Override
	public void put(Tarjeta tarjeta, long id) {
		// TODO Auto-generated method stub
		tDAO.findById(id).ifPresent((x)->{
			tarjeta.setId(id);;
			tDAO.save(tarjeta);
		});
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		tDAO.deleteById(id);;
	}

}
