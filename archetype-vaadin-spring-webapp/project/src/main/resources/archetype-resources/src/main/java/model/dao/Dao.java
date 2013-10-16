#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model.dao;

import java.io.Serializable;

import ${package}.model.domain.Dominio;
import org.springframework.stereotype.Repository;

@SuppressWarnings("serial")
@Repository
public class Dao implements Serializable{

	private int id = 0;
	
	public void persist(Dominio dominio){
		id++;
		dominio.setId(id);
		System.out.println(dominio.toString());
	}
}
