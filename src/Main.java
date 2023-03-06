import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Random rand = new Random();
        int attendance = rand.nextInt(3);

        if (attendance == 0) {
            System.out.println("Employee is absent");
        } else if (attendance == 1){
            int wage = 500;
            int workingHours = 8;
            int totalWage = wage * workingHours;
            System.out.println("Employee is full time");
            System.out.println("Wage per day is: Rs. " +totalWage);
        } else{
            int wage = 200;
            int workingHours = 4;
            int totalWage = wage * workingHours;
            System.out.println("Employee is part-time");
            System.out.println("Wage per day is: Rs. " +totalWage);
        }
    }
}
