
public class Question_12 {

	public static void main(String[] args) {

		long my_num = 1L;
		
		int increase = 1;
		int num_div = 0;
		
		while(num_div <= 500)
		{
			//System.out.print(my_num);
			
			for(int i = 1; i <= my_num; i++)
			{
				if(my_num % i == 0)
				{
					num_div++;
				}
			}
			
			if(num_div <= 500)
			{
				increase++;
				my_num += increase;
				num_div = 0;
			}
		}
		
		System.out.print(my_num);
		
	}
}
