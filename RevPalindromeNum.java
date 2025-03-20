class RevPalindromeNum 
{
	public static void main(String[] args) 
	{
		int num = 56, dup = num, rev = 0, rev1 =0;

		while (dup > 0)
		{
			rev = rev * 10 + ( dup % 10);
			dup /= 10;
		}
		int sum = num + rev;
		int dup_sum = sum;
		while (dup_sum > 0)
		{
			rev1 = rev1 * 10 + (dup_sum % 10);
			dup_sum /= 10;
		}
		if (sum == rev1)
		{
			System.out.print(num + " is a palindrome num");
		}

	}
}
