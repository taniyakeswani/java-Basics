class PrimeRange 
{
	public static void main(String[] args) 
	{
		int a = 10, b= 30;
        System.out.print("[ ");
		for (int i = a; i <= b; i++)
		{
			int count = 0;
			for (int j = 1; j <= i;  j++)
			{
				if (i % j == 0)
				{
					count++;
				}
			}
			
			if (count == 2)
			{
				System.out.print(i + ",");
			}
		}
		System.out.print("]");
	}
}
