import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
			ArrayList<String> city = new ArrayList<String>();

			city.add("Amman");
			city.add("Irbid");
			city.add("Zarqa");
			// set value using index
			city.set(1, "Alaqaba");
			// remove value using index
			city.remove(0);
			
			for(int i = 0; i < city.size();i++) {
				System.out.println(city.get(i));
			};
			
			
			// clear array list
			city.clear();
			
			for(int i = 0; i < city.size();i++) {
				System.out.println(city.get(i));
			};
	}

}
