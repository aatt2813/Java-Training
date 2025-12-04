package M1_Activity5;

public class Activity_5 {

        public static void main(String[] args) {
                int result = getSum(); 
                System.out.println("Sum = " + result); // Display the computed sum stored in result
        }

        // Method to get the sum of numbers from 1 to 50
        public static int getSum() {
                int sum = 0; // Initialize sum as 0
                for (int i = 1; i <= 50; i++) { // Loop from 1 to 50, each number in i is added to sum
                        sum += i;
                }
                return sum; // Return the final sum
        } // end of method getSum

} // end of class