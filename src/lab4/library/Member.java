package lab4.library;

import java.util.ArrayList;

public class Member {
	public static int nextID = 1;

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String _name;
	private int _memberID;

	// private borrowedbBooks DONE: implement collection of borrowed books

	private ArrayList<Book> _borrowedBooks;

	public Member(String name) {
		this._name = name;
		this._memberID = nextID++;
		this._borrowedBooks = new ArrayList<>();
	}
	public String get_name() {
		return _name;
	}
	public int get_memberID() {
		return _memberID;
	}

	// DONE: implement functionality of Member class
	public void borrowBook(Book book) {
		book.setIsAvailable(false);
		_borrowedBooks.add(book);
	}
	public void returnBook(Book book) {
		book.setIsAvailable(true);
		_borrowedBooks.remove(book);
	}
	public ArrayList<Book> getBorrowedBooks() {
		return _borrowedBooks;
	}
	public boolean hasBorrowedBook(Book book) {
		return _borrowedBooks.contains(book);
	}
	@Override
	public String toString() {
		return "Member{memberID=" + _memberID + ", name='" + _name + "', borrowedBooks=" + _borrowedBooks + '}';
	}
}
