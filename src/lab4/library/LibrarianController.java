package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class
	private Library _library;

	public LibrarianController(){
		_library = new Library();
	}

	public void borrowBook(String bookName, String memberName){

	}

	public void returnBook(String bookName, String memberName){

	}

	public void removeBook(String bookName){
		
	}
}
