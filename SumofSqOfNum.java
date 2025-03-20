class SumofSqOfNum 
{
	public static void main(String[] args) 
	{
		int n = 3;
		int sum = 0;

		for (int i = 1; i <= n; i++)
		{
			sum += i*i;
		}
		System.out.print(sum);
	}
}
