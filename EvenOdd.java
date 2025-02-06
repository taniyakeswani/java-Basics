import java.util.Scanner;
class  EvenOdd
{
	public static void main(String[] args) 
	{
		//System.out.print("Enter a number: ");
		//int num = new Scanner(System.in).nextInt;
	    //System.out.print(num %2 == 0);
		//System.out.print((num /2) == (num / 2.0));
	    //System.out.print((num/2) == num);
		
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
        String ans = num % 2 == 0 ? "even" : "odd";
		System.out.println(ans);
	}
}


