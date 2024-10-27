package Library;

public class InvalidIdException extends RuntimeException {
 @Override
 public String toString() {
	 return getClass()+"InvalidIdException";
 }
}
