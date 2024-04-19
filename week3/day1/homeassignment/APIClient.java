package week3.day1.homeassignment;

public class APIClient {
	public void sendRequest(String endpoint ) {
		System.out.println(" This is a Polymorphism: sendRequest."+ " "+ endpoint);
	}
	public void sendRequest(String endpoint, String requestBody,boolean requestStatus) {
		System.out.println("This is a polymorphism"+ " "+ endpoint+ requestBody+ requestStatus);
	}
	public static void main(String[] args) {
		APIClient ol= new APIClient();
		ol.sendRequest("request");
		ol.sendRequest(" client ", " active ", true);
		

	}

}
