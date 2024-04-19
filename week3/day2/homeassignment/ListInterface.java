package week3.day2.homeassignment;

public class ListInterface {

	public static void main(String[] args) {
		int[] a={3, 2, 11, 4, 6, 7};
		int[] b ={1, 2, 8, 4, 9, 7};
		for(int i=0 ; i<a.length; i++)
		{
			if(a[i]==b[i])
			{
				System.out.println("Value at index " + i + " is equal: " + a[i]);
			}
		}

	}

}
