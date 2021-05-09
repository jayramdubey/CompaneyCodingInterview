package housejoyIn;

import java.util.Scanner;

public class StoneJwels {

	public static void main(String[] args) {
		System.out.println("Enter the Tpe of stones and jwels");
		Scanner sc = new Scanner(System.in);
		String stone = sc.nextLine();
		String jwells = sc.nextLine();
		printResult(stone, jwells);

	}

	private static void printResult(String stone, String jwells) {

		char stype[] = stone.toCharArray();
		char jwtype[] = jwells.toCharArray();
		int p = 0;
		for (int i = 0; i < stype.length; i++) {

			for (int j = 0; j < jwtype.length; j++) {
				if (stype[i] == jwtype[j]) {
					p += 1;
				}
			}
		}
		System.out.println("Output : " + p);
	}

}
