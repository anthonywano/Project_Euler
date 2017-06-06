
public class Question_01 {

	public static void main(String args[])
	{
		
		int max = 1000;
		int sum = 0;
		//int count = 1;
		
		int [] three_times = new int[max];
		int [] five_times = new int[max];
		
		for(int i = 0; i*3 < max; i++ )
		{
			three_times[i] = i*3;
		}
		
		for(int i = 0; i*5 < max; i++ )
		{
			five_times[i] = i*5;
		}		
		
		for(int i = 0; i < max; i++)
		{
			if(three_times[i]%5 != 0)
			{
				sum += three_times[i];
			}
			
			sum += five_times[i];
			
		}
		
		System.out.println(sum);
		
	}
	
}
