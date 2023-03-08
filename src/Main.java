import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employment type( 1 for full time 2 for part time");
       int employmentType = sc.nextInt();
        System.out.println("Enter number of hours worked:");
        int hoursWorked = sc.nextInt();
        int wagePerHour = 20;
        int dailyWage= 0;
        switch (employmentType) {
            case 1:
                if (hoursWorked == 8) {
                    dailyWage = wagePerHour * hoursWorked;
                } else {
                    System.out.println("Error: Full time employees must work 8 hours per day.");
                }
                break;
            case 2: // part time
                if (hoursWorked == 4) {
                    dailyWage = wagePerHour * hoursWorked;
                } else {
                    System.out.println("Error: Part time employees must work 4 hours per day.");
                }
                break;
            default:
                System.out.println("Error: Invalid employment type.");
        }

        System.out.println("Daily wage: " + dailyWage);

        sc.close();
    }
}
