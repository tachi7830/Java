public class Ready02 {
   public static void main(String[] args) {
	   int number = 1;
	   while (number < 5) {
		   System.out.println(number * number);
		   number++;
	   }
	   
	   int[] numbers = {7,20,15,40};
	   for (int num = 0; num < numbers.length; num++) {
		   System.out.println(numbers[num]);
	   }
	   
	   for (int val : numbers) {
		   if (val % 2 == 0) {
			   continue;
		   }
		   System.out.println(val);
	   }
   }
}
