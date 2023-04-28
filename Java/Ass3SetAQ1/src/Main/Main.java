package Main;
class InvalidNameException extends Exception {
 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidNameException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        String name = "John"; // example name with numbers
        try {
            if (name.matches(".*\\d.*")) { // check if name contains numbers
                throw new InvalidNameException("Name should not contain numbers.");
            }
            if (!name.matches("[a-zA-Z]+")) { // check if name contains only letters
                throw new InvalidNameException("Name should not contain special symbols.");
            }
            System.out.println("Name is valid.");
        } catch (InvalidNameException e) {
        	System.out.println(e);
            System.out.println("Invalid name: " + e.getMessage());
        }
    }
}

