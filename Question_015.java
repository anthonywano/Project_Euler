import java.math.BigInteger;

public class Question_15 {

	public static void main(String[] args) {
	
		/*If a set of N items contains A identical items, B identical items, and C identical items etc.., 
		then the total number of different permutations of N objects is
		N! / (A!*B!*C!...!)*/
		
		//Total number of right moves + down moves
		int n;
		
		//Total number of right moves
		int a;
		
		//Total number of down moves
		int b;
		
		BigInteger num_paths;
		BigInteger fact_n;
		BigInteger fact_a;
		BigInteger fact_b;
		
		//2X2
		a = 2;
		b = 2;
		n = a+b;
		
		fact_a = factorial(a);		
		fact_b = factorial(b);
		fact_n = factorial(n);
		
		num_paths = fact_n.divide(fact_a.multiply(fact_b));
	
		System.out.println("2x2: " + num_paths);
		
		
		//20X20
		a = 20;
		b = 20;
		n = a+b;
			
		fact_a = factorial(a);		
		fact_b = factorial(b);
		fact_n = factorial(n);
		
		num_paths = fact_n.divide(fact_a.multiply(fact_b)) ;
		
		System.out.println("20x20: " + num_paths);
		
	}
	
	static BigInteger factorial(int num)
	{
		BigInteger result = new BigInteger("1");
		
		while(num > 1)
		{
			result = result.multiply(BigInteger.valueOf(num));
		
			num--;
		}
		
		return result;
	}
}
