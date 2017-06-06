import java.math.BigInteger;

public class Question_16 {
	
	public static void main(String args[])
	{
		
		BigInteger num = new BigInteger("2");
		BigInteger num_2 = new BigInteger("2");
		
		String result;
		
		int sum = 0;
		
		for(int i = 1; i < 1000; i++)
		{
			num = num.multiply(num_2);
		}
		
		result = num.toString();
		
		
		for(int i = 0; i < result.length(); i++)
		{
			sum += Character.getNumericValue(result.charAt(i));
			
		}
		
		
		System.out.print(sum);
	}

}
