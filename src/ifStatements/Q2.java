package ifStatements;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*
           Problem definition :
          Get the speed of the vehicle from the user
      	  Calculate the value of the traffic fine.
          45 is the speed limit.
          If your speed is between 55-74:
          The penalty is $100.

          If your speed is between 75 and 84:
          The penalty is $150.

          If your speed is between 85 -94:
          The penalty is $320.

          If your speed is more than 94:
          The penalty is $500.

          and also,
          If the driver does not have a license, $200 is added to the penalty.

          Example: If your speed is 77, your fine is $150, but if you don't have a driver's license, the penalty will be $350.

------------------------------------------

 
   */

		Scanner scan=new Scanner (System.in);
		System.out.print("Please enter the speed of the vehicle ");
		int speed=scan.nextInt();
		
		System.out.print("Do you have a driver licence? Press -Y- for yes and -N- for no " );
		String licence=scan.next(); 
		
		
		
			if (speed<=45 && licence.toLowerCase().startsWith("y")) {
					System.out.println("You are good to go. Thanks");
			
				} else if(speed<=45 && licence.toLowerCase().startsWith("n")) {
					System.out.println("Since you do not have a driver licence, Your fine is $100");
				
			} else if( speed<=74 && licence.toLowerCase().startsWith("y")){
				System.out.println("The penalty is $100");
			} else if (speed<=74 && licence.toLowerCase().startsWith("n")) {
				System.out.println("Since you do not have a driver licence, Your fine is $300");
			} else if (speed<=84 && licence.toLowerCase().startsWith("y")) {
				System.out.println("The penalty is $150");
			} else if (speed<=84 && licence.toLowerCase().startsWith("n")) {
				System.out.println("Since you do not have a driver licence, The penalty is $350");
			} else if (speed<=94 && licence.toLowerCase().startsWith("y")) {
				System.out.println("The penalty is $320");
			} else if (speed<=94 && licence.toLowerCase().startsWith("n")) {
				System.out.println("Since you do not have a driver licence, The penalty is $520");
			} else if (speed>94 && licence.toLowerCase().startsWith("y")) {
				System.out.println("The penalty is $500");
			} else {
				System.out.println("Since you do not have a driver licence, The penalty is $720");
			}
			
			scan.close();
	
}
}