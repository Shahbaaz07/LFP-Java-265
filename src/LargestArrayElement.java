public class LargestArrayElement {
        public static void main(String[] args) {
            int[] numbers = { 5, 10, 15, 20, 25 };

            int max = numbers[0];

            for (int i = 1; i < numbers.length; i++) {

                if (numbers[i] > max) {

                    max = numbers[i];
                }
            }

            System.out.println("The largest element in the array is: " + max);
        }
    }


