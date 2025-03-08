class CoPrime 
{
	public static void main(String[] args) 
	{
		int n1 = 13;
		int n2 = 19;

		int min = n1 < n2 ? n1 : n2;

		while (true)
		{
			if (n1 % min == 0 && n2 % min == 0)
			{
				if (min == 1)
				{
					System.out.println(n1 + " and " + n2 + " are  Coprime");
				}
				else 
				{
					System.out.println(n1 + " and " + n2 + " are not Coprime");
				}
				break;
			}
			min--;
		}
	}
}
