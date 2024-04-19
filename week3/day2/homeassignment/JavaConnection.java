package week3.day2.homeassignment;

public class JavaConnection implements DatabaseConnection{

	

	public void connect() {
		System.out.println("This is a concrete class: connect");
		
	}

	public void disconnect() {
		System.out.println("This is a concrete class: disconnect");
		
	}

	public void executeUpdate() {
		System.out.println("This is a concrete class: executeUpdate");
		
	}

}
