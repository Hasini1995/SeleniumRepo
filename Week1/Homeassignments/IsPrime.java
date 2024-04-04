package Week1.Homeassignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
		int count=0;
for (int i=2; i<=n/2;i++)
{
	if(n%i==0)
	{
		count++;
		break;
	}
}
if(count==0 && n>1)
{
	System.out.println(n + " is a prime number.");
}
else
{
	System.out.println(n+ " is not a prime number.");
}
	}
	
}

