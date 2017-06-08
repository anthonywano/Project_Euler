
public class Question_03 {

	public static void main(String args[])
	{
		long my_num = 13195;
		//double test_num = 13195;
		
		int [] primes = new int[100];
		boolean isPrime;
		int count = 0;
		
		
		//generate primes
		for(int i = 1; i <= my_num; i++)
		{
			isPrime = true;
			
			for(int j = 2; j < i; j++)
			{
				if(i%j == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				if(my_num%i == 0)
				{
					primes[count] = i;
					count++;
					System.out.print(i + ", ");
				}
			}
		}
		
		System.out.print("DONE");
		
		/*count = 0;
		
		while(primes[count] != 0)
		{
			System.out.print(primes[count] + ", ");
			count++;
			
		}
		*/
	}
}
