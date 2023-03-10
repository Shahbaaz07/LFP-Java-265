public class SmallestArrayElement {
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20, 25 };

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min) {

                min = numbers[i];
            }
        }

        System.out.println("The Smallest element in the array is: " + min);
    }
}




