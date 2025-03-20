class ArmstrongCheck 
{
	public static void main(String[] args) 
	{
		int num = 1634;
		int dup= num; 
		int len = 0; 
		int sum = 0;

		while (dup > 0)
		{
			len++;
			dup/=10;
		}
         
		dup = num;
		while (dup > 0)
		{
			int digit = dup % 10;
			int pow = 1;
			for (int i = pow; i <= len; i++)
			{
				pow *= digit;
			}
			sum += pow;
			dup /= 10;
		}
		 if (num == sum)
		 {
			 System.out.println(num + " is a  Armstrong number");
		 }
		 else 
			 System.out.println(num + " is not a  Armstrong number");
	}
}
