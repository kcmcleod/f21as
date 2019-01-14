package lab.exceptions;


public class NoMatchingIDException extends Exception {

	public NoMatchingIDException(String id){
		super("No such ID = " + id);
	}
}
