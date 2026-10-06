import java.util.Scanner;
public class IT26102415Lab3Q2{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the monthlySalary: ");
	double monthlySalary=input.nextDouble();
	System.out.print("Enter the OTHours: ");
	double oTHours=input.nextDouble();
	System.out.print("Enter the OTHourly rate: ");
	double oTHourlyRate=input.nextDouble();
	double oTAmount=oTHours * oTHourlyRate;
	double totalSalary=monthlySalary + oTAmount;
	System.out.println();
	System.out.println("the total salary: "+ totalSalary);
	
	
	
	
	}
}
		