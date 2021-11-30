package scanner;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		/*  Problem definition
        By taking the total hours of a worker' working time and the total number of workers, calculate the job completion time
        For example, a worker can do a job in 10 days.
        In how many days will two workers do the same work?

        Sample Screen Output
         In how many days does a worker complete the work? 10
         How many workers will work in total? 2
        The completion time is 5 days.
    */
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("In how many days does a worker complete the job?");
		int day=scan.nextInt();
		
		System.out.println("How many workers will work on the job?");
		int numOfWorkers=scan.nextInt();
		
		int completionTime=day/numOfWorkers;
		
		System.out.println("The completion time is: "+completionTime + " days");

		scan.close();
}
}