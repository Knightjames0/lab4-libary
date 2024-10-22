package lab4.library;
 
public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String _title;
	private boolean _isAvailable; 
	
	// TODO: implement Book functionality 
	public Book(String title){
		_title = title;
		_isAvailable = true;
	}

	public boolean isAvailable(){
		return _isAvailable;
	}

	public void setIsAvailable(Boolean state){
		_isAvailable = state;
	}
	public String getTitle(){
		return _title;
	}
	public String toString(){
		return _title;
	}
	
}
