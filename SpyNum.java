class SpyNum 
{
	public static void main(String[] args) 
	{
		int num = 132;
		int temp = num;
		int sum = 0;
		int prod = 1;

		while (temp > 0)
		{
			sum += temp % 10;
			prod *= temp % 10;
			temp /= 10;
		}

		if (prod == sum)
		{
			System.out.println(num + " is a spy number");
		}
		else
			System.out.println(num + " is not a spy number");
	}
}
