package atelierTD1;
import java.util.Scanner;

public class EX8 {
	
	class Ex8 {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Donner la taille : ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}


}
