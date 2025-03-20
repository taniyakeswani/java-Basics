class SumOfOddNum
{
	public static void main(String[] args) 
	{
		int n = 5;
		int sum = 0;
		int odd = 1;

		for (int i = 0;i < n ; i++)
		{
			sum += odd;
			odd += 2;
		}
		System.out.println("the sum of first " + n + " odd numbers is " + sum);
	}
}
