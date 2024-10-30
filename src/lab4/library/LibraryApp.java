package lab4.libC;
//Simplified verion of libC Management System

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class LibraryApp {
//
// private ArrayList<String> availableBooks = new ArrayList<>();
// private HashMap<String, ArrayList<String>> memberBorrowedBooks = new HashMap<>();
//
// // Adds a book to the libC catalog
// public void addBook(String bookName) {
//     availableBooks.add(bookName);
//     System.out.println(bookName + " has been added to the catalog.");
// }
//
// // Adds a new member to the libC (without a separate class)
// public void addMember(String memberName) {
//     if (!memberBorrowedBooks.containsKey(memberName)) {
//         memberBorrowedBooks.put(memberName, new ArrayList<>());
//         System.out.println("Member " + memberName + " has been added.");
//     } else {
//         System.out.println("Member " + memberName + " already exists.");
//     }
// }
//
// // Borrow a book from the libC
// public void borrowBook(String bookName, String memberName) {
//     if (!memberBorrowedBooks.containsKey(memberName)) {
//         System.out.println("Member " + memberName + " not found.");
//         return;
//     }
//
//     if (availableBooks.contains(bookName)) {
//         availableBooks.remove(bookName);
//         memberBorrowedBooks.get(memberName).add(bookName);
//         System.out.println(memberName + " has successfully borrowed " + bookName);
//     } else {
//         System.out.println(bookName + " is either already borrowed or not available.");
//     }
// }
//
// // Return a book to the libC
// public void returnBook(String bookName, String memberName) {
//     if (!memberBorrowedBooks.containsKey(memberName)) {
//         System.out.println("Member " + memberName + " not found.");
//         return;
//     }
//
//     if (memberBorrowedBooks.get(memberName).contains(bookName)) {
//         memberBorrowedBooks.get(memberName).remove(bookName);
//         availableBooks.add(bookName);
//         System.out.println(memberName + " has successfully returned " + bookName);
//     } else {
//         System.out.println(memberName + " didn't borrow " + bookName);
//     }
// }
//
// // Show the available books in the libC
// public void showAvailableBooks() {
//     System.out.println("Available Books:");
//     for (String book : availableBooks) {
//         System.out.println(book);
//     }
// }
//
////Show members of in the libC
//public void showMembers() {
//   System.out.println("libC members:");
//   for (String member : memberBorrowedBooks.keySet()) {
//       System.out.println(member);
//   }
//}
  
public static void main(String[] args) {
	
	 LibrarianController libC = new LibrarianController();
	 //libC lib
	 Library library = new Library();
	 System.out.println(" *** libC management system demo *** ");
	 
    // Adding some books to the catalog
	System.out.println("\n *** Adding \"Dune\" to the libC:");
	libC.addBook("Dune");
	
	System.out.println("\n *** Adding \"1984\" to the libC:");
	libC.addBook("1984"); 
	
	System.out.println("\n *** Adding \"Moby Dick\" to the libC:");
    libC.addBook("Moby Dick");

    // Show available books
    System.out.println("\n *** Show all books:");
    library.showAvailableBooks();
    
    // Adding members
    System.out.println("\n *** Adding \"Alice\" to the libC members");
    libC.addMember("Alice");
    
    System.out.println("\n *** Adding \"Bob\" to the libC members");
    libC.addMember("Bob");

    // Show members
    System.out.println("\n *** Show all members");
    library.showMembers();
    
    // Borrow a book
    System.out.println("\n *** Alice borrows Dune:");
    libC.borrowBook("Dune", "Alice");

    // Show available books after borrowing
    System.out.println("\n *** Show all books:");
    library.showAvailableBooks();

    System.out.println("\n *** Bob borrows 1984:");
    libC.borrowBook("1984", "Bob");
    
    // Show available books after borrowing
    System.out.println("\n *** Show all books:");
    library.showAvailableBooks();
    
    System.out.println("\nBob borrows Dune:");
    libC.borrowBook("Dune", "Bob");
    
    // Show available books after borrowing
    System.out.println("\n *** Show all books:");
    library.showAvailableBooks();
    
    // Return a book
    System.out.println("\n *** Alice returns Dune:");
    libC.returnBook("Dune", "Alice");

    // Show available books after returning
    System.out.println("\n *** Show all books:");
    library.showAvailableBooks();

    System.out.println("\n *** Bob borrows Dune:") ;
    libC.borrowBook("Dune", "Bob");
    
    // Show available books after borrowing
    System.out.println("\n *** Show all books:");
    library.showAvailableBooks();

	}
}