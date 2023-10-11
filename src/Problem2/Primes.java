package Problem2;


public class Primes {

	public static void main(String[] args) {
		

		int nValues = 50;
		
		boolean isPrime = true;
		
		System.out.println("Prime numbers are : ");
		
		for(int i = 2; i <= nValues; i++)
		{
			isPrime = true;
			int sqrt = (int) Math.sqrt(i);
			
			for (int j = 2; j <= sqrt; j++)
			{
				
				if (i % j == 0)
				{
					
					isPrime = false;
					
					continue;
				} 
			}
			
			if (isPrime)
				System.out.print(i + " ");
		}

		
	}

}
