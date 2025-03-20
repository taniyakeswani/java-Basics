class NextPalindrome 
{
	public static void main(String[] args) 
	{
		int n = 123;

		while (true)
		{
			n++;
			int rev = 0, dup = n;

			while (dup > 0)
			{
				rev = rev * 10 + ( dup % 10);
				dup /= 10;
			}
			if (n == rev)
			{
				System.out.print(n);
				break;
			}
		}
	}
}
