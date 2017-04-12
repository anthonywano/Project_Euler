
public class Question_5 {
	public static void main(String args[])
	{
		boolean found = false;
		
		long my_num = 20L;
		
		while(!found)
		{
			found = true;
			
			for(int i = 1; i <= 20; i++)
			{
				if(my_num%i != 0)
				{
					found = false;
				}
			}
			
			my_num++;
		}
		
		System.out.print(my_num-1);
		
	}
}
