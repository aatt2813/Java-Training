package activity_fundamentals.activity_3;

import java.util.Scanner;

public class Activity_3 {

        public static void main(String[] args) {
                try (Scanner input = new Scanner(System.in)) {
	                    System.out.print("Enter 1st Integer: ");
		                int nm1 = input.nextInt();
						
						System.out.print("Enter 2nd Integer: ");
						int nm2 = input.nextInt();
						
		                System.out.println("Sum: " + getSumTotal(nm1, nm2));		 
		                System.out.println("Difference: " + getDiffTotal(nm1, nm2));
						System.out.println("Product: " + getProdTotal(nm1, nm2));
	            } catch (Exception e) {
	                    e.printStackTrace();
                }
        }
		
		public static int getSumTotal(int x, int y) {
                return x + y;
        }
		
		public static int getDiffTotal(int x, int y) {
                return x - y;
        }
		
		public static int getProdTotal(int x, int y) {
                return x * y;
        }
		
}