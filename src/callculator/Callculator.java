package callculator;

import java.util.Scanner;

public class Callculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kullanmak istedi�iniz iki say�y� se�iniz.");
		
		System.out.println("Birinci Say�:");
		int say�1 = sc.nextInt();
		System.out.println("�kinci say�:");
		int say�2 = sc.nextInt();
		
		System.out.println("Yapmak istedi�iniz i�lemi tu�lay�n�z.");
		System.out.println("1.Toplama");
		System.out.println("2.��karma");
		System.out.println("3.�arpma");
		System.out.println("4.B�lme");
		
		
		

		
		
		int op = sc.nextInt();

		
		switch (op) {
		case 1:
			System.out.println("Sonu�= " + addition(say�1, say�2));
			break;
		case 2:
			System.out.println("Sonu�= " + substraction(say�1, say�2));

			break;
		case 3:
			System.out.println("Sonu�= " + multiplication(say�1, say�2));

			break;
		case 4:
			System.out.println("Sonu�= " + division(say�1, say�2));

			break;

		default:
			break;
		}

	}

	public static int addition(int a, int b) {

		return a + b;
	}

	public static int substraction(int a, int b) {

		return a - b;

	}

	public static int multiplication(int a, int b) {

		return a * b;

	}

	public static int division(int a, int b) {
		if (b != 0) {
			return a / b;
		}

		else
			return 0;
	}

}
