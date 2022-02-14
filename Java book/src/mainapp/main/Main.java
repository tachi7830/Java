package mainapp.main;
import mainapp.logic.MainLogic;

public class Main {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;

		int total = MainLogic.tasu(a, b);
		int delta = mainapp.logic.MainLogic.hiku(a, b);

		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
