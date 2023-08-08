package day4Assignment;

import java.util.Scanner;

public class Reversenumbers {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int sum = 5;
		while (n>0){
			
			int r = n%10;
			sum = (sum*10)+r;
			n = n/10;	
		}	
	System.out.println(sum);
	

	}







	}


