
public class Question_07 {
	public static void main(String args[]) {

		int num_primes = 0;
		long cur_num = 2L;
		long cur_prime = 2L;
		
		boolean isPrime;
		
		while (num_primes <= 10001)
		{
			
			isPrime = true;

			for (int j = 2; j < cur_num/2; j++) 
			{
				if (cur_num % j == 0) 
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				num_primes++;
				cur_prime = cur_num;
			}
			
			cur_num++;
		}
		
		System.out.print(cur_prime);
	}
}
