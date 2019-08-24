import java.util.Scanner;

public class GameWin {

	public static boolean canWin(int leap, int[] game) {
		return runForSingle(leap, game, 0, true);
		// Return true if you can win the game; otherwise, return false.
	}

	public static boolean runForSingle(int leap, int[] game, int index, boolean init) {
		System.out.println(index);
		if (index >= game.length - 1)
			return true;
		if ((index <= 0 && !init) || game[index] != 0)
			return false;
		return runForSingle(leap, game, index + 1, false) || runForSingle(leap, game, index + leap, false)
				|| runForSingle(leap, game, index - 1, false);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}
}
