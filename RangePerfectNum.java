class  RangePerfectNum
{
	public static void main(String[] args) 
	{
		int perfect_sum = 0;
		for (int i = 1; i <= 1000; i++)
		{
			int sum = 0;
			for (int j = 1; j < i; j++)
			{
				if (i % j == 0)
				{
					sum += j;
				}
			}
			if (i == sum)
	        {
			     perfect_sum += i;
	      	}
		}
		System.out.println(perfect_sum);
	}
}
