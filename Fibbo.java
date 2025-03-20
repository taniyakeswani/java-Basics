class Fibbo 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int first = 0;
		int second = 1;

		System.out.print("[ "+ first);

		if (n > 1)
		{
              System.out.print(" , " + second);
		}

		for (int i = 2; i < n ; i++)
		{
			int sum = first + second;
			System.out.print(", "+ sum);
		    first = second;
			second = sum;
		}
		System.out.print(" ]");
	}
}

