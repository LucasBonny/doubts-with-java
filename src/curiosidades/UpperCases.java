package curiosidades;

import java.util.Scanner;

public class UpperCases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fal = sc.nextLine();
		StringBuilder obj = new StringBuilder(fal);
		obj.setCharAt(0, String.valueOf(obj.charAt(0)).toUpperCase().charAt(0));
		for(int i = 0; i < obj.length(); i++) {
			if(i < obj.length() - 1 && obj.charAt(i) == ' ') {
				obj.setCharAt(i+1, String.valueOf(obj.charAt(i+1)).toUpperCase().charAt(0));
			}
		}
		System.out.println(obj);
		sc.close();
	}

}
