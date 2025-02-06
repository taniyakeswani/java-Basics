import java.util.Scanner;
class NumberExample 
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number: ");
		// number is inti
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int sum = 0;       

		while(num > 0)   
		{
			int rem = num % 10;
			sum += rem;
			num/=10;


		}
		System.out.println(sum);
		System.out.println(dup);




		//int num = 123456;
		//int rem;
	}
}




