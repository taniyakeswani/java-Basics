class Gcd 
{
	public static void main(String[] args) 
	{
		int a = 36;
		int b = 60;

		int min = b > a ? b : a;
		for (int i = min; i > 0; i--)
		{
			if (a % i == 0 && b % i == 0)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
