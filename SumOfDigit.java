import java.util.Scanner;
class SumOfDigit 
{
	public static void main(String[] args) 
	{
        //Scanner sc = new Scanner(System.in);
		//System.out.println("ENTER A NUMBER : " );
		//int num = sc.nextInt();

		//int add = (num /100);
		//int add1 = (num % 100) / 10;
		//int add2 = (num % 100)%10;
		//int sum = add + add1 + add2;
		//System.out.println("THE SUM OF DIGIT IS :  " + sum);

       // int sum = 0;
		//int even = 0;
		//int odd = 0;
		
		//int num = 1234;
		//System.out.println(num);

       // int rem = num % 10;    //4
		//System.out.println(rem);
 
		//sum = sum + rem;
		//System.out.println(sum);
        
		//int even = rem / 2 == 0 ? rem : 0;//
        //System.out.println(even);

		// int sum = sum + rem





		//int num = 1234;
		//int even = 0;
		//int rem = num % 10;                         // 4
		
       //int add = (rem%2 == 0) ? rem : 0;            //4
		//even = even + add;
		
		//rem = (num % 100) / 10;                  //3
		//add = (rem%2 == 0) ? rem : 0;           //3
        //even = even + add;
		
        //rem = (num % 1000) / 100;           //2       
	    //add = (rem%2 == 0) ? rem: 0;           
       // even = even + add;                          //6
		
       // rem = num /1000;                         //   1   
	   // add = (rem%2 == 0) ? rem: 0;           
       // even = even + add;      
		//System.out.println(even);


		int num = 1234;
		int sum = 0;
	    int rem = num % 10;

		sum = sum + rem;                // 0 + 4

		rem = (num % 100) / 10;    // 3 
        sum = sum + rem;                // 4 + 3 = 7

		rem = (num % 1000) / 100;   //2
        sum = sum + rem;                    // 4 + 3 + 2 = 9

		rem = num / 1000;                //1
        sum = sum + rem;                  // 4 + 3 + 2 + 1 = 10
		System.out.println(sum);

	}
}

