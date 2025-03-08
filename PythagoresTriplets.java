import java.util.Scanner;
class PythagoresTriplets 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter height");
		int height = sc.nextInt();
		System.out.println("enter base");
		int base  = sc.nextInt();
		System.out.println("enter hypo");
		int hypo = sc.nextInt();

		int add = (base * base) + (height * height);

		if (add == (hypo * hypo))
		{
			System.out.println("it is pythagores triplets");
		}
		else 
			System.out.println("it is not  pythagores triplets");
	}
}
