import java.io.*;
import java.io.FileWriter;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      // Create FileWriter & Scanner objects & y/n string
      Scanner scan = new Scanner(System.in);
      
    
      FileWriter fw = new  FileWriter( new File("expenses.txt"));
      BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outToFile = new PrintWriter(bw);
String answer;

     
    do{  System.out.println("Input your name:");
        String name = scan.nextLine();
        System.out.println("What did you purchase?");
        String items = scan.nextLine();
        System.out.println( "How much did you pay? (in USD)");
        double payment = scan.nextDouble();

      outToFile.println(name + " purchased " + items + " for " + payment);
      System.out.println("Would you like to log another purchase? (y/n)");
     scan.nextLine();
      answer = scan.nextLine();

    }while(answer.equals("y"));
outToFile.close();
System.out.println("Would you like to read a summary of your purchases?");
String ans= scan.nextLine();

if(ans.equals("y")){ Scanner fileScan = new Scanner( new File("expenses.txt"));
   while(fileScan.hasNextLine()) {
          System.out.println( fileScan.nextLine());}
fileScan.close();
}else if(ans.equals("n")){
System.out.println("Get off of ZoodMall!");}


    

scan.close();








      
      // Start gathering information inside the loop you will start

      // Close ClassWriter & Scanner objects
        
        
      // If you have already have a expenses.txt file, you need to delete it
      // before you compile your code again
  }
}
