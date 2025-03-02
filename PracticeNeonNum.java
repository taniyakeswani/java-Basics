import java.util.Scanner;
class PracticeNeonNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int sq = num * num;
		int sum = 0;

		for (int i = sq; i > 0; i /= 10)
		{
			int rem = i % 10;
			sum += rem;
		}
		System.out.println(num == sum ? num + " is  neon number " : " is not a neon number");
	}
}
