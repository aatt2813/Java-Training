package activity;

import java.util.Scanner;

public class Activity_2 {

        public static void main(String[] args) {
                try (Scanner input = new Scanner(System.in)) {
	                    System.out.print("Enter your Age: ");
		                String age = input.nextLine();
						
						int ageAsInt = Integer.parseInt(age);
						double ageAsDouble = (double) ageAsInt;
		 
		                System.out.println("Your age as Integer: " + ageAsInt);
						System.out.println("Your age as Double: " + ageAsDouble);
	            } catch (Exception e) {
	                    e.printStackTrace();
                }
        }
		
}
