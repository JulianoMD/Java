package utils;

import java.util.Scanner;

public class Leitura {

	private static Scanner sc = new Scanner(System.in);

	public static int LeInt(String msg) {
		System.out.print(msg);
		int result = sc.nextInt();
		sc.nextLine(); // Consume newline left-over
		return result;
	}

	public static float LeFloat(String msg) {
		System.out.print(msg);
		float result = sc.nextFloat();
		sc.nextLine(); // Consume newline left-over
		return result;
	}

	public static String leStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}

}