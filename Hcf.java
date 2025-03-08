class Hcf 
{
	public static void main(String[] args) 
	{
		int n1 = 8;
		int n2 = 6;

		int min = n1<n2 ? n1 : n2;

		while (true)
		{
			if (n1 % min == 0 && n2 % min == 0)
			{
				System.out.println(" the hcf of " + n1 + " and " + n2 + " : " + min);
				break;
			}
			min--;
		}
	}
}
