package week3.day1.homeassignment;

public class OddIndexUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch = test.toCharArray();
		for (int i = ch.length-1; i >=0 ; i--) {
			if(i%2!=0)
			{
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
			String ms=new String(ch);
			System.out.println(ms);
			
		}
		
		

	}
