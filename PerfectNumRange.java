class PerfectNumRange 
{
	public static void main(String[] args) 
	{
		int a = 1, b = 1000;
		int tot_sum = 0;
		for (int i = a; i <= b; i++)
		{
			int sum = 0;
			for (int j = 1; j <= i ;j++ )
			{
				if (i % j == 0)
				{
					sum += j;
				}
			}
			if (sum == i)
			{
				tot_sum += sum;
			}
		}
		System.out.println(tot_sum);
	}
}
