import java.util.Scanner;
class LargestOfFourDigit	
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num1:  " );
		int num1 = sc.nextInt();
		System.out.println("enter a num2:  " );
		int num2 = sc.nextInt();
		System.out.println("enter a num3:  " );
		int num3 = sc.nextInt();
		System.out.println("enter a num4:  " );
	    int num4 = sc.nextInt();
       
	   //  int ans = ((num1 > num2) ? (num1) : (num2)) ? ((num3 > num4) ? (num3) : (num4)) : ((num1 > num3) ? (num1) : (num3));

	  // int largest = (num1 > num2) ? ( ( num1 > num3) ? (num1 > num4) ? (num1) : (num4));

		System.out.println(largest);
	}
}
