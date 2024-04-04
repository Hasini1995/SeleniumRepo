package Week1.Homeassignments;

public class Palindrome {
	public static void main(String[] args) {

		int number=121;
		int remainder;
		int temp=number;
		int output=0;
		while(number>0)
		{
			remainder=number%10;
			output=(output*10)+ remainder;
			number=number/10;
		}
	if(output==temp)
{
	System.out.println("The number is Palindrome");
}
else
{
	System.out.println("The number is not a palindrome");
}
	
	}

}
