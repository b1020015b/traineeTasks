package task21;

import java.util.Scanner;

public class Program {

	public static void main (String args[]) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Введите первое число");
		int a = in.nextInt();
		System.out.println("Выберите операцию (+, -, *, /, |)");	// Для операции сравнения используется символ "|" 
		char operation = in.next().charAt(0);
		System.out.println("Введите второе число");
		int b = in.nextInt();
		
			if (operation == '+') {
				int result = a + b;
				System.out.println(result);
			}
			
			else if (operation == '-') {
				int result = a - b;
				System.out.println(result);
			}
				
			else if (operation == '*') {
				int result = a * b;
				System.out.println(result);
			}	
			
			else if (operation == '/') {
				int result = a / b;
				System.out.println(result);
			}
			
			else if (operation == '|') {
				
				if (a>b) {
					System.out.println("a > b");
				}
				
				else if (a<b) {
					System.out.println("a < b");
				}
				
				else {
					System.out.println("a = b");
				}
			}
			
			else {
				System.out.println("Выбрана некорректная операция");
			}	
	}
}