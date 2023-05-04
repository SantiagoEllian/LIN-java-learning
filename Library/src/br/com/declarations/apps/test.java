package br.com.declarations.apps;

import br.com.declarations.entities.Author;
import br.com.declarations.entities.Book;

public class test {

	public static void main(String[] args) {
		Author au = new Author("Name", "Email@email.email");
		Book bk = new Book("Title", au, "Pub", "2022", 189, "8");
		System.out.println(bk.vals());
	}

}
