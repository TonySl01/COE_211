import java.util.Scanner;

public class EntryPoint {
	public static void main(String[] args) {

int B =(int) (Math.random()*10 + 1) ;
for(int i = 0; i < B; i++)
{
System.out.println(" You have "+ (B-i) +" " + "insertions left.");

Scanner scan= new Scanner(System.in);

System.out.println("Please input the employee's first name: ");
String Firstname= scan.nextLine();

System.out.println("Please input the employee's last name: ");
String Lastname= scan.nextLine();

System.out.println("Please input the employee's age: ");
int Age= scan.nextInt();

System.out.println("Please input the employee's monthly salary: ");
double Monthlysalary= scan.nextDouble();

System.out.println("Employee information: " + Firstname + " " + Lastname +", " + Age + ", " + Monthlysalary);

}


	}
}