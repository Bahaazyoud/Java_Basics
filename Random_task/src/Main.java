import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt();
		System.out.println("random number with type integer :"+x);
		
		int y = random.nextInt(6)+1;
		System.out.println("random number with type integer from 0 to 6 :"+y);
		
		double z = random.nextDouble();
		System.out.println("random number with type double :"+z);
		
		double w = random.nextDouble(6)+1;
		System.out.println("random number with type double from 0.0 to 6.0:"+w);
		
		boolean t = random.nextBoolean();
		System.out.println("random boolean ( true or false ):"+t);
	}

}
