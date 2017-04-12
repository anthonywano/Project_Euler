
public class Question_6 {
	public static void main(String args[])
	{
		int sum_square = 0;
		int square_sum = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			square_sum += i;
			
			sum_square += i*i;
		}
		
		square_sum = (square_sum*square_sum);
		
		
		System.out.print(square_sum - sum_square);
	}
}
