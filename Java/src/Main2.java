
public class Main2 {
	public static void main(String[] args) {

		//	  １～１０の数字から偶数のみ昇順で表示する
		for (int num = 1; num <= 10; num++) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}

		//    １～１０の数字から奇数のみ降順で表示する
		for (int num = 10; num >= 1; num--) {
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}

		//	  １～１０の数字から偶数の合計と個数を表示する
		int sum0 = 0;
		int sum1 = 0;
		for (int num = 1; num <= 10; num++) {
			if (num % 2 == 0) {
				sum0 += num;
				sum1++;
			}
		}
		System.out.println("個数:" + sum1 + "合計:" + sum0);

		//	  １～１０の数字からカンマ区切りで横並びに表示させる
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			if (i <= 10 - 1) {
				System.out.print(",");
			}
		}

	}
}
