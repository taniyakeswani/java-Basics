class CondOperExample 
{
	public static void main(String[] args) 
	{
		int a = 22;
		int b = 2;
		int c = 1;

		int largest = (a > b)?((a > c)?(a):(c)):((b>c)?(b):(c));
		System.out.println(largest);
	}
}
