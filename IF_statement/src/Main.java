import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Your age is :");
		int age = scanner.nextInt();
		if(age>=18)System.out.println("You are an adault!"); else System.out.println("You are not an adault!"); 
	}

}
