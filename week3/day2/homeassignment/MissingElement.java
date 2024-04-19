package week3.day2.homeassignment;

public class MissingElement {

	public static void main(String[] args) {
		
		        // Declare the array
		        int[] arr = {1, 2, 3, 4, 10, 6, 8};

		        // Sort the array in ascending order
		        java.util.Arrays.sort(arr);

		        // Iterate through the array to find missing elements
		        for (int i = 0; i < arr.length - 1; i++) {
		            if (arr[i] + 1 != arr[i + 1]) {
		                // Print the missing number
		                for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
		                    System.out.println("Missing number: " + j);
		                }
		            }
		        }
	}
}
		   
