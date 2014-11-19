import java.util.Scanner;
public class Test {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		//using methods defined in a & b
		int i = 0;
		int counter = 0;
		for (i = 0; i < 3; i++) {
			counter += X(Y(i));
			System.out.println("counter: "+counter);
		}
	}

	public static int X(int i) {
		return i / 2;
	}
	public static int Y(int z) {
		return z + 1;
	}

}