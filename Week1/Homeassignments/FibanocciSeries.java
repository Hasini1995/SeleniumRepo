package Week1.Homeassignments;

public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,count=8;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<count;++i)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		

	}

}
//Fibonacci series  – 0, 1, 1, 2, 3, 5, 8, and 13.