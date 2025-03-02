class PracticeSumOfDigit 
{
	public static void main(String[] args) 
	{
		int num = 123444;
		int sum = 0;

// using while 
		while (num > 0)
		{
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);

// using for
		for (; num > 0; num /= 10)
		{
			sum += num % 10;
		}
		System.out.println(sum);
	}
}
