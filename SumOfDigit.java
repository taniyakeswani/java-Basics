class SumOfDigit 
{
	public static void main(String[] args) 
	{
		int num = 456, sum = 0;

		while (num > 0)
		{
			int digit = num % 10;
			sum += digit;
			num /= 10;
		}
		System.out.println(sum);
	}
}
