import java.util.Scanner;
class Percent10th 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter marks out of 600: " );
		double marks = sc.nextDouble();

		double percent = (marks* 100) / 600;

		//double passing = (35 * 100) / 600;

		String result = ((percent >= 35)? ("Pass with " + percent + "%" ) : ("Oops you are fail  with " + percent + "%" ));
		System.out.println(result);
	}
}



