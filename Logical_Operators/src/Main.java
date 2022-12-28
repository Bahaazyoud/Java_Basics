import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Press S Or s To Start A Game :");
		Scanner scanner = new Scanner(System.in);
		String response = scanner.next();

		if(response.equals("Q") || response.equals("q")) {
			JOptionPane.showMessageDialog(null, "You are Quit from the game!!");
		}else if(response.equals("S") || response.equals("s")) {
			JOptionPane.showMessageDialog(null, "You are Start the game!!");
		}else {
			JOptionPane.showMessageDialog(null,"Yor are not Start the game!!");
		}
		
	}

}
