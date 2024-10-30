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
		_library.borrowBook(bookName, memberName);
	}

	public void returnBook(String bookName, String memberName){
		_library.returnBook(bookName, memberName);
	}

	public void removeBook(String bookName){
		_library.removeBook(bookName);
	}

	public void addBook(String bookName, String authorName){
		_library.addBook(bookName, authorName);
	}

	public void addMember(String name){
		_library.registerMember(name);
	}

	public void showMembers(){
		_library.showMembers();
	}

	public void showAvailableBooks(){
		_library.showAvailableBooks();
	}
}
