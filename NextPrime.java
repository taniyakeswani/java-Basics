class NextPrime 
{
	public static void main(String[] args) 
	{
		int num = 14;

		while (num > 0)
		{
			int count = 0;
			num += 1;

			for (int j = 1; j <= num; j++)
			{
				if (num % j == 0)
				{
					count++;
				}
			}
			if (count == 2)
			{
				System.out.print(num);
				break;
			}
		}
	}
}
