import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter radius :" );
		int radius = sc.nextInt();
		final float pi = 22/7;

		float area = pi * radius * radius;

		System.out.println("area of circle is : " + area);


       float perimeter = 2 * (22/7) * radius;
	   System.out.println("Perimeter of circle is : " + perimeter);
	}
}
