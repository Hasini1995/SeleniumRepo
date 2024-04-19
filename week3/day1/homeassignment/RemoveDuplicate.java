package week3.day1.homeassignment;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int count=0;
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		for (int i=0; i< split.length; i++)
		{
			for (int j=i+1; j< split.length;j++)
			{
				if (split[i].equalsIgnoreCase(split[j])) 
				{
					split[j]="";
					count++;
				}
			}
			
		}
			if (count > 0) {
	            StringBuilder result = new StringBuilder();
	            for (String word : split) {
	                if (!word.isEmpty()) {
	                    result.append(word).append(" ");
	                }
	            }
	            System.out.println("Modified Text: " + result.toString().trim());
	        } 
			else 
			{
	            System.out.println("No duplicate words found.");
	        }
		}
}