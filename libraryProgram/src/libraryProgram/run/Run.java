package libraryProgram.run;

import libraryProgram.model.service.BookService;

public class Run {

	public static void main(String[] args) {

		BookService book = new BookService();
		book.displayMenu();
	}

}
