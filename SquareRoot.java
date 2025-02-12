import java.util.Scanner;
class SquareRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int op = sc.nextInt();

		if ( num * num == op)
		{
			System.out.println("number has a perfect square");
		}
		System.out.println("number doest not have a perfect square");
	}
}
