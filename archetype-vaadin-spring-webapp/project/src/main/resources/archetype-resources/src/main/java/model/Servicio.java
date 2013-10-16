#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

import java.io.Serializable;

import ${package}.model.dao.Dao;
import ${package}.model.domain.Dominio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@SuppressWarnings("serial")
@Service
public class Servicio implements Serializable {

	@Autowired
	private Dao dao;
	
	public void persisDominio(Dominio dominio){
		this.dao.persist(dominio);
	}
}
