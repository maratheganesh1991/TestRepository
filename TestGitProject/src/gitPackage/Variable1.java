package gitPackage;

public class Variable1 {

	public static void main(String[] args) {

		Variable1 v1 = new Variable1();

		int x = 7;
		int y = 10;
		v1.sum(x, y);
	}

	public void sum(int b, int d) {

		int s = b + d;
		System.out.println("Sum is :- " + s);
	}
}
