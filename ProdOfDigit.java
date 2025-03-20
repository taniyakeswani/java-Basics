class ProdOfDigit 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int prod = 1;
		while (num > 0)
		{
			prod *= num % 10;
			num /= 10;
		}
		System.out.println(prod);
	}
}
