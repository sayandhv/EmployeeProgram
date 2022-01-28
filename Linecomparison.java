package com.bridgelabz;

import java.util.Scanner;

public class Linecomparison {
	
	
	public static int length()
    {
    
     System.out.println("Calculating lingth of a line");
      Scanner sc = new Scanner(System.in) ;
      

         
          System.out.println("Enter first co-ordinates (x,y) ");  
          System.out.print("Enter x co-ordinate: ");  
          int x1= sc.nextInt();  
          System.out.print("Enter y co-ordinate: "); 
          int y1= sc.nextInt(); 
          System.out.println("Enter second co-ordinates (x,y) ");  
          System.out.print("Enter x : ");  
          int x2= sc.nextInt();  
          System.out.print("Enter y : "); 
          int y2= sc.nextInt(); 

          // Calculate length
          double length =  Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
          System.out.println(" Length of line : " + length);

    
    
 return 1;
  }
	
	public void Linescomparison()
	{
		
		System.out.println("Comparing length of two lines ");
		 Scanner sc = new Scanner(System.in);
		 
	
		System.out.println("Enter first coordinates of first line");
		System.out.println("Enter x coordinate x1: ");
		int x1 = sc.nextInt();
		System.out.println("Enter y coordinate y1: ");
		int y1 = sc.nextInt();
		System.out.println("Enter the second coordinates of first line");
		System.out.println("Enter x coordinate x2");
		int x2 = sc.nextInt();
		System.out.println("Enter y coordinate y2: ");
		int y2 = sc.nextInt();
		double length1 = (int) Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2));
		System.out.println("Length of first line is = "+length1);
		
		
		System.out.println("Enter first coordinates of second line (a , b)");
		System.out.println("Enetr a1: ");
		int a1 = sc.nextInt();
		System.out.println("Enetr b1 : ");
		int b1 = sc.nextInt();
		System.out.println("Enter 2nd coordinates of 2nd line");
		System.out.println("Enetr a2: ");
		int a2 = sc.nextInt();
		System.out.println("Enter b2 :");
		int b2 = sc.nextInt();
		double length2 = (int) Math.sqrt(Math.pow(a2 - a1 , 2) + Math.pow(b2 - b1 , 2));
		System.out.println("Length of 2nd line is = " +length2);
		if (length1 == length2)
		{
			
			System.out.println("Limes are equal");
			
		}
		else {
			System.out.println("Lines are not equal");
		}
		
		
	
		
	}

	public static void main(String[] args) {
		length();
		// TODO Auto-generated method stub
		Linecomparison ls = new Linecomparison();
		ls.Linescomparison();

	}

}
