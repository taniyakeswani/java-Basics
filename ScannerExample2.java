import java.util.Scanner;
class ScannerExample2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");         //ramesh kumar
		String str1 = sc.next();
		System.out.println("output of string1: " + str1);                                //ramesh
		
		String buffermemory =  sc.nextLine();
        System.out.println("buffermemory: " + buffermemory);     // kumar
		
		System.out.println("Enter a String2: "); 
		String str2 = sc.nextLine();                         // Hello Java
		System.out.println("output of string2 : " + str2);                   // Hello Java
	}
}
