package week3.day2.homeassignment;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a={3, 2, 11, 4, 6, 7};
		Arrays.sort(a);
		
		int SecondLargest = a[a.length-2];
		System.out.println("Second largest number: "+ SecondLargest);

	}

}
