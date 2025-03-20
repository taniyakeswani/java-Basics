class SumOfEvenNum 
{
	public static void main(String[] args) 
	{
		int a = 1, b = 10;
		int sum = 0;

		for (int i = a; i<= b; i++)
		{
			if (i % 2 == 0)
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
