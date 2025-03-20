class Divide3and5 
{
	public static void main(String[] args) 
	{
		int a = 1;
		int b = 50;
		System.out.print("[");
		for (int i = a; i <= b;i++ )
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.print("]");
	}
}
