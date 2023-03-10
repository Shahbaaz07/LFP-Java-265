public class SecondLargestArray {
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    secondLargest = largest;
                    largest = numbers[i];
                } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                    secondLargest = numbers[i];
                }
            }

            System.out.println("The second largest number in the array is: " + secondLargest);
        }
    }


