
public class Question_09 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		
		
		for(int i = 1; i < 1000; i++)
		{
			for(int j = 1; j < 1000; j++)
			{
				for(int k = 1; k < 1000; k++)
				{
					if(i < j && j < k && (i+j+k) == 1000 && ((i*i)+(j*j)==(k*k)))
					{
						a = i;
						b = j;
						c = k;
					}
				}
			}
		}
		
		
		System.out.println("a: " + a + ", b: " + b + ", c: " + c );
		//System.out.println("a^2 + b^2 = : " + a + ", b: " + b + ", c: " + c );
		
		System.out.print(a*b*c);
		
		
	}

}
