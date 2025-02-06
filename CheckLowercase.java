import java.util.Scanner;
class CheckLowercase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any alphabet : ");
		char ch = sc.next().charAt(0);
        String ans = ((ch >= 'a' && ch <= 'z')?(ch + " alphabet is lowercase" ):(ch + " alphabet is not lowercase" ));


		System.out.println(ans);
	}
}
