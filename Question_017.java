import java.util.Arrays;

public class Question_17 {

	public static void main(String args[])
	{
		long sum = 0L;
		String num;
		
		for(int i = 1; i <= 1000; i++)
		{
			num = Integer.toString(i);
			
			if(num.length() == 1)
			{
				sum += ones(num.charAt(0));

			}
			
			else if (num.length() == 2)
			{	
				sum += tens(num);				
			}
			
			else if(num.length() == 3)
			{
				// and
				if(num.charAt(1) != '0' || num.charAt(2) != '0')
				{
					sum += 3;
				}

				
				//hundred
				sum += 7;
				
				sum += ones(num.charAt(0));
				
				sum += tens(num.substring(1));
			}
			
			else
			{
				sum += 11;
			}
		}
		
		System.out.print(sum);
		
	}
	
	
	static int ones(char num)
	{
		int add;
		
		if(num == '0')
		{
			add = 0;
		}
		
		else if(Arrays.asList('1','2','6').contains(num))
		{
			add = 3;
		}
		
		else if(Arrays.asList('4','5','9').contains(num))
		{
			add = 4;
		}
		
		else
		{
			add = 5;
		}
		
		return add;
	}
	
	
	static int tens(String num)
	{
		int add = 0;
		
		if(num.charAt(0) == '0')
		{			
			add += ones(num.charAt(1));
		}
		
		else if(num.charAt(0) == '1')
		{
			if(num.charAt(1) == '0')
			{
				add += 3;
			}
			
			else if(Arrays.asList('1','2').contains(num.charAt(1)))
			{
				add += 6;
			}
			
			else if(Arrays.asList('5','6').contains(num.charAt(1)))
			{
				add += 7;
			}
			
			else if(Arrays.asList('3','4','8','9').contains(num.charAt(1)))
			{
				add += 8;
			}
			
			else
			{
				add += 9;
			}
		}
		
		else if(Arrays.asList('4','5','6').contains(num.charAt(0)))
		{
			add += 5;
			
			add += ones(num.charAt(1));
		}
		
		else if(Arrays.asList('2','3','8','9').contains(num.charAt(0)))
		{
			add += 6;
			
			add += ones(num.charAt(1));
		}
		
		else
		{
			add += 7;
			
			add += ones(num.charAt(1));
		}
		
		return add;
	}
}
