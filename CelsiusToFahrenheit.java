import java.util.Scanner;
class CelsiusToFahrenheit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the degree in celsius");       // entered value is 43
        double celsius = sc.nextDouble();
        
		
		//double fahrenheit = (9/5) * celsius + 32;
		double fahrenheit = 9.0/5 * celsius + 32;

		System.out.println("clesius to fahrenheit is : " + fahrenheit);
	}
}
