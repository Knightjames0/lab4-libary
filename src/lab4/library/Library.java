package lab4.library;
import java.util.ArrayList;

public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:
	// private catalog (list of Book) 
	// private members (list of Members)

	// TODO: implement functionality of Member class
	private ArrayList<Book> _catalog;
	private ArrayList<Member> _members;

	public Library(){
		_catalog = new ArrayList<Book>();
		_members = new ArrayList<Member>();
	}


	 // Adds a book to the library catalog
	public void addBook(String bookName) {
			_catalog.add(new Book(bookName));
			System.out.println(bookName + " has been added to the catalog.");
		
	}
	private Member findMemberByName(String name){
		for (Member member : _members) {
			
		}
		return null;
	} 
	private Book findBookByTitle(String title){
		for (Book book : _catalog) {
			if(book.getTitle().equals(title)){
				return book;
			}
		}
		//book not found in catalog
		return null;
	}
	// Adds a new member to the library (without a separate class)
	public void registerMember(String memberName) {
		if(findMemberByName(memberName) == null){
			System.out.println("Member " + memberName + " already exists.");
		}else{
			//_members.add(new Member(memberName));// or in LibrarianController class
			System.out.println("Member " + memberName + " has been added.");
		}
	}
   
	// Borrow a book from the library
	public void borrowBook(String bookName, String memberName) {
		Member member = findMemberByName(memberName);
		Book book = findBookByTitle(bookName);
		if(member == null){
			System.out.println("Member " + memberName + " not found.");
			return;
		}
		if(book == null){
			System.out.println(bookName + " is not available.");
			return;
		}
		if (book.getIsAvailable()) {
			//member stuff
			//availableBooks.remove(bookName);
			//memberBorrowedBooks.get(memberName).add(bookName);
			book.setIsAvailable(false);
			System.out.println(memberName + " has successfully borrowed " + bookName);
		} else {
			System.out.println(bookName + " is already borrowed.");
		}
	}
   
	// Return a book to the library
	public void returnBook(String bookName, String memberName) {
		Member member = findMemberByName(memberName);
		Book book = findBookByTitle(bookName);
		if (member == null) {
			System.out.println("Member " + memberName + " not found.");
			return;
		}
		//member borrow stuff
		// if (memberBorrowedBooks.get(memberName).contains(bookName)) {
		// 	memberBorrowedBooks.get(memberName).remove(bookName);
		// 	availableBooks.add(bookName);
		// 	System.out.println(memberName + " has successfully returned " + bookName);
		// } else {
		// 	System.out.println(memberName + " didn't borrow " + bookName);
		// }
	}
   
	// Show the available books in the library
	public void showAvailableBooks() {
		System.out.println("Available Books:");
		for (Book book : _catalog) {
			if(book.getIsAvailable()){
				System.out.println(book);
			}
		}
	}
	// Show the all books in the library
	public void showAllBooks() {
		System.out.println("Available Books:");
		for (Book book : _catalog) {
			System.out.println(book);
		}
	}
   
   //Show members of in the library
   public void showMembers() {
	  System.out.println("Library members:");
	  for (Member member : _members) {
		  System.out.println(member);
	  }
   }


}
