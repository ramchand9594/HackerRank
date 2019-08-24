import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger i = scanner.nextBigInteger();
		BigInteger j = scanner.nextBigInteger();
		System.out.println(i.add(j));
		System.out.println(i.multiply(j));
	}

}
