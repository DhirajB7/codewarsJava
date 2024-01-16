package codewars.kyu5;

public class RgbToHex {

	public static String hexForInt(int a) {
		if (a < 0) {
			a = 0;
		}

		if (a > 255) {
			a = 255;
		}

		String hex = Integer.toHexString(a).toUpperCase();
		return hex.length() == 1 ? "0" + hex : hex;
	}

	public static String rgb(int r, int g, int b) {

		return hexForInt(r) + hexForInt(g) + hexForInt(b);

	}

	public static void main(String[] args) {
		System.out.println(rgb(255, 255, 255));
		System.out.println(rgb(255, 255, 300));
		System.out.println(rgb(0, 0, 0));
		System.out.println(rgb(10, 10, 10));
		System.out.println(rgb(148, 0, 211));
	}

}
