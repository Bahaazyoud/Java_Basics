import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 when we have a lot of if statement (we can use switch statement)
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Day : ");
		String day = scanner.nextLine();
		switch(day) {
			case "Sunday":
				System.out.println("The day is : " + day);
				break;
			case "Monday":
				System.out.println("The day is : " + day);
				break;
			case "Tuesday":
				System.out.println("The day is : " + day);
			case "Wednesday":
				System.out.println("The day is : " + day);
				break;
			case "Thursday":
				System.out.println("The day is : " + day);
				break;
			case "Friday":
				System.out.println("The day is : " + day);
				break;
			case "Saturday":
				System.out.println("The day is : " + day);
				break;
			default:System.out.println("Your input : " + day + " is not a day"); 
			
		}
	}

}
