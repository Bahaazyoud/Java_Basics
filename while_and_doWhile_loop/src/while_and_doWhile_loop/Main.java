package while_and_doWhile_loop;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while(name.isEmpty()) {
			System.out.print("Enter Your Name : ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello " + name);
		
//		do {
//			System.out.println("Enter Your Name : ");
//			name = scanner.nextLine();
//		}while(name.isEmpty());
//		System.out.print("Hello" + name);
	}
}
