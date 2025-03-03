class ArmstrongNum 
{
	public static void main(String[] args) 
	{
		int num = 153;
		int len = 0;

		for (int i = num; i > 0 ; i/=10)
		{
			len++;
		}
		
        int sum = 0;
		//int pow = 1;

		for (int j = num ; j > 0 ; j /= 10 )
		{
			int rem = j % 10;
			int pow = 1;

			for (int i = 1; i <= len ; i++ )
			{
				pow *= rem;
			}
			sum += pow;
		}

		if (sum == num)
		{
			System.out.println("armstrong num" );
		}
		else 
			System.out.println(" not a armstrong num ");
		
	}
}
