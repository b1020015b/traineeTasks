package task22;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Введите первую строку");
		String str1 = in.nextLine();
		System.out.println("Введите вторую строку");
		String str2 = in.nextLine();
		
		if (str1.equals(str2)) {
		      System.out.println("Строки идентичны");
		    }
		else {
		      System.out.println("Строки неидентичны");
		    }
		
	}
}
