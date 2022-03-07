import java.util.Scanner;

public class Calculator {
    private int a;
    private int b;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */
        System.out.print("Input the first number: ");
        a = scanCalc.nextInt();
        System.out.print("Input the operator: ");
    operator= scanCalc.nextLine(); 
    scanCalc.nextLine();
        System.out.print("Input the second number: ");
        b = scanCalc.nextInt();
        // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
        operator= "+" ;
        switch (operator) {
            case "+":
            System.out.println(add(a, b)) ;
            
                break;
            case "x":
            multiply(a, b);
                break;
                case "-":
            subtract(a, b);
            break;
            case "/":
          divide(a, b);
       
            break;
            default:
        }
    }

    public String add(int a, int b) {
        /**
         * Enter logic
         */
       String added= a + "+" +b +"=" +(a+b) ;
        return added;
    }

    public String subtract(int a, int b) {
        /**
         * Enter logic
         */
        return a + "-" +b +"=" +(a-b) ;
    }

    public String multiply(int a, int b) {
        /**
         * Enter logic
         */
        return a + "x" +b +"=" +(a*b) ;
    }

    public String divide(int a, int b) {
        /**
         * Enter logic
         */
        return a + "/" +b +"=" +(a/b) ;
    }
}