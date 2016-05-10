package practice.java.edu;

public class Fib {

	public static void main(String[] args) {

		int n = 0;
		int n1 = 1;
		int n2;

		int count = 15;
		int i;

		for (i = 2; i < count; ++i) {

			n2 = n + n1;
			n = n1;
			n1 = n2;

			System.out.print(" " + n);

		}
	}

}
