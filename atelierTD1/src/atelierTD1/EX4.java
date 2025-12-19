package atelierTD1;
import java.util.Scanner;
public class EX4 {
	

	class Ex4 {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Donner une chaine : ");
	        String texte = sc.nextLine();

	        System.out.print("Donner le nombre de fois : ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            System.out.println(texte);
	        }

	        sc.close();
	    }
	}


}
