package codewars.kyu6;

import java.util.TreeMap;

public class YourOrder {

	public static String order(String words) {

		if (words.length() == 0) {
			return "";
		}

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		for (int i = 1; i <= 9; i++) {
			tm.put(i, "");
		}

		for (String a : words.split(" ")) {
			int key = Integer.valueOf(a.replaceAll("[a-zA-Z]+", ""));
			tm.replace(key, a);
		}

		return String.join(" ", tm.values().stream().filter(a -> a.length() > 0).toList());
	}

	public static void main(String[] args) {

		System.out.println(order("is2 Thi1s T4est 3a"));
		System.out.println(order("1 2 3 4 5 6 7 8 9"));

	}

}
