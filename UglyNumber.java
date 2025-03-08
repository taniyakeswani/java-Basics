class UglyNumber 
{
	public static void main(String[] args) 
	{
		int num = 13;

		if (num % 2 == 0)
		{
			num/=2;
			System.out.println(num + " is a ugly number ");
		}
		else if (num % 3 == 0)
		{
			num/=3;
			System.out.println(num + " is a ugly number ");
		}
		else if (num % 5 == 0)
		{
			num/=5;
			System.out.println(num + " is a ugly number ");
		}
		else
		{
			System.out.println(num + " is not a ugly number ");
		}
	}
}
