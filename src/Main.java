import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Random rand = new Random();
        int attendance = rand.nextInt(2);

        if (attendance == 0) {
            System.out.println("Employee is absent");
        } else {
            System.out.println("Employee is present");
        }
    }
}
