import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
       Scanner scan= new Scanner(System.in);
       String ans;

    do {   System.out.println("Which service would you like to use? ");
        System.out.println ("[1]: Basic week visualizer");
        System.out.println( "[2]: Advanced week visualizer");
        System.out.println("[3]: Basic calculator");
        System.out.println ("[4]: Employee repertoire");


       int number= scan.nextInt();
    
       if(number>4 || number<1){  
            do {System.out.println(" \n Please make sure you pick a number between 1 and 4");
         System.out.println("Which service would you like to use? ");
     System.out.println ("[1]: Basic week visualizer");
     System.out.println( "[2]: Advanced week visualizer");
     System.out.println("[3]: Basic calculator");
     System.out.println ("[4]: Employee repertoire");
 number= scan.nextInt()
;  }while(number>4 || number<1);

     }
        
        if (number == 1) {
        BasicWeek basicweek = new BasicWeek() ;
        basicweek.printDays();
        }
        if (number == 2) {
        AdvancedWeek advancedweek = new AdvancedWeek();
        advancedweek.printDays(); }
        if (number == 3){
            Calculator calc = new Calculator();  }
        if (number == 4){
            Employee emp = new Employee();
           System.out.println( emp.toString());
        }
        System.out.println(" \n Would you like to perform another operation? (y/n) ");
       
        scan.nextLine() ;
        ans= scan.nextLine();  
     
    } while (ans.equals("y"));
    
}}