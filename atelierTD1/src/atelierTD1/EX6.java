package atelierTD1;
import java.util.Scanner;
public class EX6 {
	

	class Ex6 {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Donner 6 entiers :");

	        int max = sc.nextInt();

	        for (int i = 2; i <= 6; i++) {
	            int val = sc.nextInt();
	            if (val > max) {
	                max = val;
	            }
	        }

	        System.out.println("Le maximum est = " + max);

	        sc.close();
	    }
	}


}
