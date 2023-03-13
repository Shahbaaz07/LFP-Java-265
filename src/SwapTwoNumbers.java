import java.util.Scanner;
public class SwapTwoNumbers {
        public static void main(String[] args) {
            int num1, num2, temp;
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            num1 = input.nextInt();

            System.out.print("Enter second number: ");
            num2 = input.nextInt();

            temp = num1;
            num1 = num2;
            num2 = temp;

            System.out.println("After swapping, the first number is " + num1 + " and the second number is " + num2);
        }
    }


