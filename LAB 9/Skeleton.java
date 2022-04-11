import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        // Initialize array of integers
        int sum =0;
int[] assignments = new int[5];
Scanner scan = new Scanner(System.in);
        // for loop to get user input & store in array
            for(int i=0; i<assignments.length ; i++){
                System.out.println("Input the grade of assignment " + (i+1));
                assignments[i]= scan.nextInt();
            }
            System.out.println("Input the number of attended labs out of 7");
            int attendance = scan.nextInt();
            System.out.println("Input the midterm grade");
            int midterm = scan.nextInt();

            for(int i=0 ; i<assignments.length; i++){
                sum += assignments[i];
            }
int assignmentGrade =(int) ((sum/ assignments.length)*0.3);

       int Attendgrade = (int)((attendance*100*0.05)/7) ;
       int Midgrade = (int)(midterm*0.3);
       

       System.out.println("Assignments (30%): " + assignmentGrade );
       System.out.println("Attendance (5%): " + Attendgrade );
       System.out.println("Midterm (30%): " + Midgrade );
    
scan.close();
    }
}