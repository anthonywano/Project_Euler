
public class Question_8 {
	public static void main(String args[]) 
	{
		String big_num_str = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		
		int length = big_num_str.length();
		System.out.println(length);
		
		long max_product = 0L;
		long cur_product = 0L;
		long i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13;
		
		char[] big_num_elements = big_num_str.toCharArray();
		
		for(int i = 12; i < length; i++)
		{			
			i1 = Long.valueOf(Character.getNumericValue(big_num_elements[i]));
			i2 = Long.valueOf(Character.getNumericValue(big_num_elements[i-1]));
			i3 = Long.valueOf(Character.getNumericValue(big_num_elements[i-2]));
			i4 = Long.valueOf(Character.getNumericValue(big_num_elements[i-3]));
			i5 = Long.valueOf(Character.getNumericValue(big_num_elements[i-4]));
			i6 = Long.valueOf(Character.getNumericValue(big_num_elements[i-5]));
			i7 = Long.valueOf(Character.getNumericValue(big_num_elements[i-6]));
			i8 = Long.valueOf(Character.getNumericValue(big_num_elements[i-7]));
			i9 = Long.valueOf(Character.getNumericValue(big_num_elements[i-8]));
			i10 = Long.valueOf(Character.getNumericValue(big_num_elements[i-9]));
			i11 = Long.valueOf(Character.getNumericValue(big_num_elements[i-10]));
			i12 = Long.valueOf(Character.getNumericValue(big_num_elements[i-11]));
			i13 = Long.valueOf(Character.getNumericValue(big_num_elements[i-12]));
			
			cur_product = i1*i2*i3*i4*i5*i6*i7*i8*i9*i10*i11*i12*i13;
			
			
			if(cur_product > max_product)
			{
				max_product = cur_product;
			}
		}
		
		System.out.print(max_product);
	}	
}
