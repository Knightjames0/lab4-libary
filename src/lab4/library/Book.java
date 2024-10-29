package lab4.library;
 
public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String _authorName;
	private String _title;
	private boolean _isAvailable; 
	
	// Done: implement Book functionality 
	public Book(String title, String authorName){
		this._title = title;
		this._isAvailable = true;
		this._authorName = authorName;
	}

	public boolean getIsAvailable(){
		return _isAvailable;
	}

	public void setIsAvailable(Boolean state){
		this._isAvailable = state;
	}
	public String getTitle(){
		return _title;
	}
	public String toString(){
		return _title + " " + _authorName;
	}
	
}
