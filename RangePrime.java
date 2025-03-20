class RangePrime 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 50;

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
				System.out.print(i);
			}
		}
	}
}
