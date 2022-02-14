public class Main5 {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		System.out.print("偶数");
		for (int i = 0; i < 10; i++) {
			
			if(i % 2 == 0) {
				System.out.print(num[i]);
			} 
		}
		System.out.print("奇数");
		for (int i = 0; i < 10; i++) {
			if(i % 2 != 0) {
				System.out.print(num[i]);	
			} 
		}
 	}
}
