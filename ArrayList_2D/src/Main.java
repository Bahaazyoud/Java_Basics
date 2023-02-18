import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> grocery = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("pasta");
		food.add("Mansaf");
		
//		System.out.println(food.get(1));
		
		ArrayList<String> drink = new ArrayList<String>();
		drink.add("cola");
		drink.add("water");
		
		
		grocery.add(food);
		grocery.add(drink);
		System.out.println(grocery);
		System.out.println(grocery.get(1).get(0));

	}

}
