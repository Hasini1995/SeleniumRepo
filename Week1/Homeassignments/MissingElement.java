package Week1.Homeassignments;

public class MissingElement {

	public static void main(String[] args) {
		int a[]={1,4,3,2,8,6,7};
		int n=a.length+1;
		int totalSum=n*(n+1)/2;
		int actualSum=0;
		for(int num : a)
		{
			actualSum +=num;
		}
		int missingElement= totalSum-actualSum;
		System.out.println("Missing Element:" + missingElement);
		// TODO Auto-generated method stub

	}
}
