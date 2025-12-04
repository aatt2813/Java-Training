package m1_activity4;

import java.util.Scanner;

public class Activity_4 {

        public static void main(String[] args) {
                try (Scanner input = new Scanner(System.in)) {
	                    System.out.print("Enter your Age: ");
		                int age = input.nextInt();
						
						if (age < 18) {
						        System.out.println("Minor");	
						}
						else if (age >= 18 && age <= 59) {
						        System.out.println("Adult");	
						}
						else {
						        System.out.println("Senior");	
						}
	            } catch (Exception e) {
	                    e.printStackTrace();
                }
        }
		
}