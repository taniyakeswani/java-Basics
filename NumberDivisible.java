class NumberDivisible 
{
	public static void main(String[] args) 
	{
		int a = 1, b = 20, n = 4;
		for (int i = a; i <= b; i++)
		{
			if (i % n == 0)
			{
				System.out.print(i + " ");
			}
		}
	}
}
