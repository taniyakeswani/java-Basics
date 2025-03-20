class  PalindromeRange
{
	public static void main(String[] args) 
	{
		int a = 100, b = 200;
		System.out.print(" [ ");

		for (int i = a; i <= b; i++)
		{
			int num = i;
			int rev = 0;

			while (num > 0)
			{
				int digit = num % 10;
				rev = rev * 10 + digit;
				num /= 10;
			}

			if (rev == i)
			{
				System.out.print(i + " ");
			}
		}
		System.out.print("]");
	}
}
