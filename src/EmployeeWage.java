import java.util.Scanner;

public class EmployeeWage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double hourlyRate = sc.nextDouble();

        System.out.println("Enter number of hours worked:");
        double hoursWorked = sc.nextDouble();
        // Wage per day
        double dailyWage = hourlyRate * hoursWorked;
        // wage per month
        double wagepermonth = dailyWage * 20;
        System.out.println("Wages for a month: " +wagepermonth);

    }
}
