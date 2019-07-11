/*
Name: Gustavo Adame Delarosa
Date: 9/9/18
Course: CSE 002-110
About:
This homework has the objective of giving me practice manipulating data stored in variables, 
in running simple calculations, and in printing the numerical output that I generated.
*/

/*
Directions
  Please calculate the following costs:
  Total cost of each kind of item (i.e. total cost of pants, etc)
  Sales tax charged buying all of each kind of item (i.e. sales tax charged on belts)
  Total cost of purchases (before tax)
  Total sales tax
  Total paid for this transaction, including sales tax. 
*/
public class Arithmetic{ //Start of the class
    public static void main(String[] args){ //Main method required for every java program
   //--------------------------------------------------------------------------------------
   //Initializing variables
       //Number of pairs of pants
          int numPants = 3;
       //Cost per pair of pants
          double pantsPrice = 34.98;
  
       //Number of sweatshirts
          int numShirts = 2;
       //Cost per shirt
          double shirtsPrice = 24.99;
  
       //Number of belts
          int numBelts = 1;
       //cost per belt
          double beltsCost = 33.99;
  
       //the tax rate
          double paSalesTax = 0.06;
  //--------------------------------------------------------------------------------------
  //Declaration of variables
      //total cost of pants
      double totalCostOfPants;   
      //total cost of shirts
      double totalCostOfShirts; 
      //total cost of belts
      double totalCostOfBelts;   
      
      //total sales tax of pants
      double taxCostOfPants;
      //total sales tax of shirts
      double taxCostOfShirts;
      //total sales tax of belts
      double taxCostOfBelts;
      
      //total cost of purchase
      double totalCostOfPurchase; 
      //total sales tax
      double totalSalesTax; 
      //total paid for transaction including sales tax
      double totalTransaction; 
    
  //Calculations 
      //assignment for the total cost of pants 
      totalCostOfPants = numPants * pantsPrice; 
      //assignment for the tax on the total cost of pants
      taxCostOfPants = totalCostOfPants * paSalesTax; 
      
      //assignment for the total cost of shirts
      totalCostOfShirts = numShirts * shirtsPrice; 
      //assignment for the tax on the total cost of shirts  
      taxCostOfShirts = totalCostOfShirts * paSalesTax; 
      
      //assignment for total cost of belts
      totalCostOfBelts = numBelts * beltsCost; 
      //assignment for the tax on the total cost of belts
      taxCostOfBelts = totalCostOfBelts * paSalesTax; 
     
      //assignment for the total cost of purchase in dollars
      totalCostOfPurchase = (totalCostOfBelts + totalCostOfShirts + totalCostOfPants); 
      //assignment for total cost of sales tax in dollars
      totalSalesTax = paSalesTax * totalCostOfPurchase; 
      //assignment for total cost of purchase with sales tax in dollars
      totalTransaction = totalSalesTax + totalCostOfPurchase; 
      
  //Output to console
      //prints out total cost of pants in dollars
      System.out.println("Total cost of pants is "+ (int)(100*totalCostOfPants)/100.0+" dollars"); 
      //prints out total sales tax for all pants
      System.out.println("Total sales tax for pants is "+(int)(100* taxCostOfPants)/100.0+" dollars");
      //prints out total cost of shirts in dollars
      System.out.println("Total cost of shirts is "+ (int)(100 * totalCostOfShirts)/100.0+" dollars"); 
      //prints out total sales tax for shirts in dollars
      System.out.println("Total sales tax for shirts is "+(int)(100 * taxCostOfShirts)/100.0+" dollars"); 
      //prints out total cost of belts in dollars
      System.out.println("Total cost of belts is "+ (int)(100 * totalCostOfBelts)/100.0+" dollars"); 
      //prints out total sales tax of belts in dollars
      System.out.println("Total sales tax of belts is "+ (int)(100 * taxCostOfBelts)/100.0+" dollars"); 
      //prints out total cost of purchase without tax
      System.out.println("Total cost of purchase is "+ (int)(100 * totalCostOfPurchase)/100.0+" dollars"); 
      //prints out total cost of sales tax in dollars
      System.out.println("Total sales tax is "+ (int)(100 * totalSalesTax)/100.0+" dollars"); 
      //prints out total cost of purchase with tax
      System.out.println("Total cost of purchase with tax is "+(int)(100 * totalTransaction)/100.0+" dollars"); 
  
      
    }//end of main method
  }//end of class