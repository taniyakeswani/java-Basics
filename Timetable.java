import java.util.Scanner;
class Timetable 
{
	   public static void main(String[] args) 
	   {
              Scanner sc = new Scanner(System.in);
		      System.out.println("                TIMETABLE  APPLICATION ");
		      System.out.println("1. MONDAY");
		      System.out.println("2. TUESDAY");
		      System.out.println("3. WEDNESDAY");
		      System.out.println("4. THURSDAY");
		      System.out.println("5. FRIDAY");
		      System.out.println("6. SATURDAY");
		      System.out.println("7. SUNDAY");

		      System.out.println("Enter your choice: ");
              int choice = sc.nextInt();
		
		      switch(choice)
		      {
			      case 1:
			      {
				      System.out.println("PRACTICE  MATHEMATICS" );
				      break;
			      }
			      case 2:
			      {
				      System.out.println("EXPLORE HISTORY" );
				      break;
			      }
			      case 3:
			      {
				      System.out.println("CREATE ART" );
				      break;
			      }
			      case 4:
			      {
				      System.out.println("STUDY SCIENCE" );
				      break;
			      }
			      case 5:
			      {
				      System.out.println("INDULGE IN ECONOMICS" );
				      break;
			      }
			      case 6:
			      {
				      System.out.println("DO ABACUS" );
				      break;
			      }
			      case 7:
			      {
				      System.out.println("CLEAR  BACKLOGS" );
				      break;
			      }
			      default:
			      {
				      System.out.println("Invalid");
				      break;
		          }
	       }
     }
}
