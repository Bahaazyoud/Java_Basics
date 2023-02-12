import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groacery = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("pasta");
		food.add("Mansaf");
		
//		System.out.println(food.get(1));
		
		ArrayList<String> drink = new ArrayList<String>();
		drink.add("cola");
		drink.add("water");
		
		
		groacery.add(food);
		groacery.add(drink);
		System.out.println(groacery);
		System.out.println(groacery.get(1).get(0));

	}

}
