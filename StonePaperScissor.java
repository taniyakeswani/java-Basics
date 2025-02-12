import java.util.Scanner;
class StonePaperScissor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//int num = (int) (Math.random() * 10);                      // generates random numbers
		System.out.println();
		System.out.println("                              WELCOME  to the game STONE PAPER SCISSOR");
		System.out.println();

		System.out.println("    1) STONE      2) PAPER     3) SCISSOR " );
		System.out.print(" Enter any number PLAYER1 :");
		int player1 = sc.nextInt();

	   System.out.println("    1) STONE      2) PAPER     3) SCISSOR " );
	   System.out.print(" Enter any number PLAYER2 :");
	   int player2 = sc.nextInt();


	  if ( (player1 == 1 && player2 == 1) || (player1== 2  && player2 == 2) || (player1 == 3 && player2 == 3))
	  {
		  System.out.print("    TIE " );
	  }
	  else if ((player1 == 1 && player2 == 3) || (player1 == 2 && player2 == 1) || (player1 == 3 && player2 ==2))
	  {
		  System.out.print("    PLAYER 1 WON    and   PLAYER 2 LOST" );
	  }
	  else if ((player1 == 1 && player2 == 2) || (player1 == 2 && player2 == 3) || (player1 == 3 && player2 ==1))
	  {
		   System.out.print("    PLAYER 1 LOST    and PLAYER 2 WON" );
	  }

	}
}
