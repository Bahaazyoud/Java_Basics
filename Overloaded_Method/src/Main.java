
public class Main {

	public static void main(String[] args) {
		
		int method = multiplication(1,2);
		System.out.println(method);
		
		int method1 = multiplication(1,2,4);
		System.out.println(method1);
		
		double method2 = multiplication(1.3,2.2);
		System.out.println(method2);
		
	}
	static int multiplication(int x ,int y) {
		return x + y;
	}
	static int multiplication(int x ,int y,int z) {
		return x + y + z;
	}
	static double multiplication(double x,double y) {
		return x + y;
	}
}
