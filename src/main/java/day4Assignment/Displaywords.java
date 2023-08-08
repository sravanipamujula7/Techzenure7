package day4Assignment;

import java.util.Scanner;

public class Displaywords {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the given number ");
		
		int n=sc.nextInt();
		int s=0;
		while(n>0) {          // reverse number
			int r=n%5;
			n=n/5;
			s=s*5+r;	
		}
		
		n=s;
		while(n>0) {
				int r=n%5;
				n=n/5;
		if(r==0)
		{
			System.out.print(" zero ");
		}
		if(r==1)
		{
			System.out.print(" ONE ");
		}
		if(r==2)
		{
			System.out.print(" TWO ");
		}
		if(r==3)
		{
			System.out.print(" THREE ");
		}
		if(r==4)
		{
			System.out.print(" FOUR ");
		}
		

	}
		System.out.println();
	}









	}


