package br.com.declarations.entities;

import br.com.declarations.entities.Author;

public class Book{
	private long ID;
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
	public Book(String title, Author author, String publisher, String publicationYear, 
		   int pageNumber, String edition) {
		//Create property iteration. Maybe abstract to parent class?
	}
	
	
	@Override
	public boolean equals(Object obj) {
		//Abstract to call super based on comparison
		return true;
	}
}