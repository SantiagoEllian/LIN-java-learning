package br.com.declarations.entities;

import br.com.declarations.entities.Author;
import br.com.declarations.entities.LinObj;

public class Book extends LinObj{
	private String ID;
	private String title;
	private Author author;
	private String publisher;
	private String publicationYear;
	private int pageNumber;
	private String edition;
	
	
	public Book(Book copyFrom) {
		//Create property iteration. Maybe abstract to parent class?
	}
	
	// Full-parameter builder
	public Book(Object... args) {
		super(args);
	}
	
	
	public String vals() {
		return ID + "; " + title + "// " + author.getName();
	}
	
	@Override
	public boolean equals(Object obj) {
		//Abstract to call super based on comparison
		return true;
	}
}