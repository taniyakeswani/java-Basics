class Palindrome 
{
	public static void main(String[] args) 
	{
		int num = 121;
		int dup = num;          //121
		int rev = 0;

		while (dup > 0)
		{
			int digit = dup % 10;
			rev = rev * 10 + digit;
			dup /= 10;
		}

	 	if (rev == num)
	    {
			     System.out.println(num + " is palindrome");
	    }
	}
}
