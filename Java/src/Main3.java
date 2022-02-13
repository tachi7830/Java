
public class Main3 {
	public static void main(String[] args) {
		int[] numbers2 = new int [20];
		  for (int i = 0; i < numbers2.length; i++) {
			  numbers2[i] = new java.util.Random().nextInt(6);
		  }

		  for (int i =0; i < 10; i++) {
			  if(numbers2[i] < 10) {
				  System.out.print(numbers2[i]);
				  if(numbers2[i] % 2 != 0) {
					  System.out.print(",");
				  }
			  }
		  }
		  for (int i = 10; i < 20; i++) {
			  if(numbers2[i] < 20) {
				  System.out.print(numbers2[i]);
				  if (numbers2[i] % 2 == 0 && i < 20 -1) {
						  System.out.print(",");
					  
				  }
			  }
		  }
	}
}
