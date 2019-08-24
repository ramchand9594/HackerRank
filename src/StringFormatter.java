
public class StringFormatter {

	public static void main(String[] args) {
		int s1 = 1;
		String[] ss = new String[3];
		String s = String.format("%3s", String.valueOf(s1)).replace(" ", "0");
		Math.pow(1, 2);
		System.out.println(s);
		ss[0] = String.format("%3s", String.valueOf(s1)).replace(" ", "0");
		System.out.println();
	}
}
