class AutomorphicNum 
{
	public static void main(String[] args) 
	{
		int n = 6;
		int sq = n * n;
		int temp = n;
		int divisor = 1;

		while (temp > 0)
		{
			divisor *= 10;
			temp /= 10;
		}

		if (sq % divisor == n)
		{
			System.out.println(n + " is automorphic num");
		}
		else 
		{
			System.out.println(n + " is not a automorphic num");
		}
	}
}
