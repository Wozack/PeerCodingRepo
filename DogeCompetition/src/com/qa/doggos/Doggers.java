package com.qa.doggos;

public class Doggers {

	public static void placements(int x) {

		for (int i = 1; i <= 100; i++) {

			String position = Integer.toString(i);

			if (i == x) {
				continue;
			} else if (position.equals("11")) {
				System.out.print("11th, ");
			} else if (position.equals("12")) {
				System.out.print("12th, ");
			} else if (position.equals("13")) {
				System.out.print("13th, ");
			} else if (position.endsWith("1")) {
				System.out.print((position) + "st, ");
			} else if (position.endsWith("2")) {
				System.out.print((position) + "nd, ");
			} else if (position.endsWith("3")) {
				System.out.print((position) + "rd, ");
			} else if (i == 100) {
				System.out.print((position) + "th ");
			} else
				System.out.print((position) + "th, ");

		}
	}
}
