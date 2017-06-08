
public class Question_14 {

	public static void main(String[] args) {
		
		int length = 1;
		int max_length = 0;
		long max_chain = 0L;
		
		
		for(long i = 1L; i < 1000000; i++)
		{
			/*if(i % 1000 == 0)
			{
				System.out.println(i);
			}*/
			
			length = 1;

			long n = i;
			
			while(n != 1)
			{
				if(n%2 == 0)
				{
					n = n/2;
					length++;
				}
				
				else
				{
					n = n*3 +1;
					length++;
				}
				
				/*if(n < 1)
				{
					System.out.println("Incorrect number: " + i);
					break;
				}*/
			}
			
			if(length > max_length)
			{
				max_length = length;
				max_chain = i;
			}
			
		}
		
		System.out.print(max_chain + ": " + max_length);
		
	}
}
