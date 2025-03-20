class ArmstrongRange 
{
	public static void main(String[] args) 
	{
		int a = 100;
		int b = 5000;

		for (int i = a; i <= b; i++)
		{
			int dup = i;
			int count = 0;
			int sum = 0;

			while (dup > 0)
			{
				count++;
				dup/=10;
			}

			dup = i;
			while (dup >0)
			{
				int digit = dup % 10;
				int pow = 1;

				for (int j = pow; j <= count ; j++)
				{
					pow *= digit;
				}
				sum += pow;
				dup /= 10;
			}

			if (i == sum)
			{
				System.out.println(i);
			}
		}
	}
}
