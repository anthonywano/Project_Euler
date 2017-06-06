
public class Question_10 {
	
	public static void main(String[] args) {
		
		//long my_num = 13195;
		//double test_num = 13195;
		
		boolean isPrime;
		
		long sum = 0L;
		
		//generate primes
		for(int i = 2; i <= 2000000; i++)
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
				sum += i;
			}
		}
		
		System.out.print(sum);
		
	}
}
