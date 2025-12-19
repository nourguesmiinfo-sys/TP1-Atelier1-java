package atelierTD1;
import java.util.Scanner;
public class EX9 {
	

	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Donner X : ");
	        int x = sc.nextInt();

	        System.out.print("Donner n : ");
	        int n = sc.nextInt();

	        int result = 1;
	        for (int i = 0; i < n; i++) {
	            result *= x;
	        }

	        System.out.println(x + " puissance " + n + " = " + result);

	        sc.close();
	    }
	}



