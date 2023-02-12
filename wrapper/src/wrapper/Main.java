package wrapper;
public class Main {

	public static void main(String[] args) {
		Integer a = 1;
		Double x = 1.23;
		Boolean b = false;
		Character c = 'c';
		String d = "wrapper class";
		System.out.println(d);
		
		
		int w = 123;
		// auto boxing 
		Integer q =w;
		System.out.println(q);
		
		// un boxing
		int z = q;
		System.out.println(z);
	}

}
