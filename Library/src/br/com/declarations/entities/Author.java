package br.com.declarations.entities;

import br.com.declarations.entities.Author;
import br.com.declarations.entities.LinObj;
import java.lang.reflect.*;


public class Author extends LinObj{
	private String name;
	private String email;
	
	
	public Author(Object... args){
		super(args);
	}
	
	
	public String getName() {
		return name + "; " + email;
	}

}
