
public class Question_02 {
	public static void main(String args[])
	{
		
		int first = 1;
		int next = 2;
		
		int temp;
		
		int sum = 0;
		//int count = 0;
		
		while(first < 4000000)
		{
			//System.out.println(first);
			
			if(first%2 == 0)
			{
				sum += first;
			}
			
			temp = first+next;
			first = next;
			next = temp;
			
			//count++;
		}
		
		System.out.println(sum);
	}
}
