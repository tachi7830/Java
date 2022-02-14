public class Main5 {
	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		if ((x % 2) == 0) {
			if (x >= 0)
				System.out.println("正の偶数");
			else
				System.out.println("負の偶数");
		} else {
			if (x >= 0)
				System.out.println("正の奇数");
			else
				System.out.println("負の奇数");
		}
	}
}
