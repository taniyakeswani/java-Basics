import java.util.Scanner;
class CheckDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any digit : ");
		char ch = sc.next().charAt(0) ;
		String check = (ch >= '0'  && ch <= '9') ? ("it is a digit") : ("it is not a digit");
		System.out.println(check);
	}
}
