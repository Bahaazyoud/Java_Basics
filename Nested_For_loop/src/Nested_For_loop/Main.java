package Nested_For_loop;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter The rows :");
		int rows = scanner.nextInt();
		System.out.print("Enter The coulmns :");
		int coulmns = scanner.nextInt();
		System.out.print("Enter The Key :");
		String Key = scanner.next();
		for(int i=1;i <= rows;i++) {
			System.out.println();
			for(int j=1;j<= coulmns;j++) {
				System.out.print(Key);
			}
			
		}

	}

}
