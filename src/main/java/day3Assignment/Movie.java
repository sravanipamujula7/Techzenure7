package day3Assignment;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the no of ticket:");
	    int ticket = sc.nextInt();
	    if(ticket>=5 && ticket<=40)
	    {
	        System.out.println("Do you want refreshment:");
	        String refreshment = sc.next();
	        System.out.println("Do you have coupon code:");
	        String code = sc.next();
	        System.out.println("Enter the square:");
	        String square = sc.next();
	        
	        double cost = 0;
	        switch(square)
	        {
	            case "s":
	                {
	                    int value = 129;
	                    cost = (ticket*value);
	                    if(ticket>20)
	                    {
	                        cost = cost - (cost*.1);
	                    }
	                    if(code.equals("y"))
	                    {
	                        cost = cost - (cost*.02);
	                    }
	                    if(refreshment.equals("y"))
	                    {
	                        cost = cost + (50*ticket);
	                    }
	                    
	                    System.out.println("Ticket cost:"+ String.format("%.2f",cost));
	                    
	                    break;
	                }
	            case "r":
	                {
	                    int value = 170;
	                    cost = ticket*value;
	                    if(ticket>20)
	                    {
	                        cost = cost- (cost*.1);
	                    }
	                    if(code.equals("y"))
	                    {
	                        cost = cost-(cost*.02);
	                    }
	                    if(refreshment.equals("y"))
	                    {
	                        cost = cost+(50*ticket);
	                    }
	                    
	                    System.out.println("Ticket cost:"+ String.format("%.2f",cost));
	                    break;
	                }
	            default:
	                System.out.println("Invalid Input");
	        }
	    }
	    else
	    {
	        System.out.println("Minimum of 5 and Maximum of 40 Tickets");
	    }
	}
	



	


	}


