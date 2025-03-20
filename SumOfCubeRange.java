class SumOfCubeRange 
{
	public static void main(String[] args) 
	{
		int a = 1;
		int b = 3;
		int sum = 0;
		int cube = 1;

		for (int i = a; i <= b; i++)
		{
			cube = i * i * i;
			sum += cube;
		}
		System.out.println(sum);
	}
}
