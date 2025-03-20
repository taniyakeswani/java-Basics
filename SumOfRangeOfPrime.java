class  SumOfRangeOfPrime
{
	public static void main(String[] args) 
	{
		int a = 1, b = 10;
		int sum = 0;
		
		for (int i = a; i <= b; i++)
		{
			int count = 0;
			for (int j = 1; j <= i; j++)
			{
				if (i % j == 0)
				{
					count++;
				}
			}
			if (count == 2)
		    {
	        	sum += i;
	        }
		}
		System.out.println(sum);
	}
}
