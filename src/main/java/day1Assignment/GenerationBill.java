package day1Assignment;

import java.util.Scanner;

public class GenerationBill {

	public static void main(String[] args) {
				
				Scanner scn= new Scanner(System.in);

				     System.out.println("Enter the pizza Quantity = ");
				         float PQ=scn.nextInt();
				    
				    System.out.println("Enter the Puffs Quantity = ");
				        float PfQ=scn.nextInt();  
				    
				    System.out.println("Enter the Cool drink Quantity = ");
				    float CQ=scn.nextInt(); 
				  
				            
				    System.out.println("*-------------------------------------------*");
				    
				    System.out.println("Bill Details");
				
				   System.out.print("Pizza Price = 1000");  // PRICE
				        float PizzPrice=PQ*100; // TOTAL COST OF PRODUCT
				        System.out.println("  Pizza QTY = "+PQ);// NO.OF QTY
				        
				        System.out.print("Puffs price = 240");
				        float PuffsPrice=PfQ*20;
				        System.out.println("  Puff QTY = "+PfQ);
				        
				        System.out.print("Drinks Price = 50");
				        float CoolDrinkPrice=CQ*10;
				        System.out.println("  Cool Drink QTY = "+CQ);
				        
				 
				       
				       
				      float   Total=PizzPrice+PuffsPrice+CoolDrinkPrice;
				      
				    
				      System.out.println("tota price = "+Total+" Rs/- ");
				      
				     
				      
				    

					}

				

		

	}


