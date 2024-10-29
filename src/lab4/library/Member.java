package lab4.library;

import java.util.ArrayList;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	private int memberID ;

	// private borrowedbBooks DONE: implement collection of borrowed books

	private ArrayList<Book> borrowedBooks;

	public Member(String name, int memberID) {
		this.name = name;
		this.memberID = memberID;
		this.borrowedBooks = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public int getMemberID() {
		return memberID;
	}

	// DONE: implement functionality of Member class
	public void borrowBook(Book book) {
		borrowedBooks.add(book);
	}
	public void returnBook(Book book) {
		borrowedBooks.remove(book);
	}
	public ArrayList<Book> getBorrowedBooks() {
		return borrowedBooks;
	}
	public boolean hasBorrowedBook(Book book) {
		return borrowedBooks.contains(book);
	}
	@Override
	public String toString() {
		return "Member{memberID=" + memberID + ", name='" + name + "', borrowedBooks=" + borrowedBooks + '}';
	}
}
