package br.com.declarations.entities;

import br.com.declarations.entities.Author;

public class Author{
	private String name;
	private String email;
	
	
	// Copy builder
	public Author(Author auth) {
		//Create property iteration. Maybe abstract to parent class?
	}
	
	public Author(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	// Override later to format getProperty/setProperty(prop_name, value)
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}

}
