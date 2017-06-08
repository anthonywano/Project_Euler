
public class Question_04 {

	public static void main(String args[])
	{
		int product;
		int length;
		int max = 0;
		
		for(int i = 100; i < 1000; i++)
		{
			for(int j = 100; j < 1000; j++)
			{
				product = i*j;
				
				if(Integer.toString(product).length()%2 == 0)
				{
					length = Integer.toString(product).length();
					
					String half = Integer.toString(product).substring(length/2, length);
					
					StringBuffer reverse = new StringBuffer(half);
	
					if(Integer.toString(product).substring(0, length/2).equals(reverse.reverse().toString()))
					{
						//System.out.println(product + ": " + Integer.toString(product).substring(0, length/2) + ", " + reverse.reverse().toString());
						if(product > max)
						{
							max = product;
						}
					}
				}
			}
		}
		
		System.out.print(max);
	}
}
