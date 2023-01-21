
public class Main {

	public static void main(String[] args) {
//		String[][] cars = new String[2][2];
//		cars[0][0] = "BMW";
//		cars[0][1] = "Camaro";
//		cars[1][0] = "Corvette";
//		cars[1][1] = "Tesla";
		
		String[][] cars = {
				{"BMW","Camaro"},
				{"Corvette","Tesla"}
		};
		
		for(int i=0; i < cars.length;i++) {
			System.out.println();
			for(int j=0 ; j < cars[i].length;j++) {
				System.out.print(cars[i][j]+ " ");
			}
		}
	}

}
