//  Hotel Suites occupancy
// This program calculates the occupancy rate for a hotel's suites.
// These are located on floors 10-16. There is no 13th floor.


import java.util.Scanner;
import java.text.*;
public class HotelOccupancy
{
	
	int total_occupied;
	double occupancy_rate; 
	
	private Scanner scan;

	public void calcRate()
	{
		
		final int SUITES_PER_FLOOR = 20;  // Number of suites per floor
		final int MIN_FLOOR = 10;         // Lowest floor of suite units
		final int MAX_FLOOR = 16;          // Highest floor of suite units
		final int TOTAL_SUITES = (MAX_FLOOR - MIN_FLOOR) * SUITES_PER_FLOOR;
	   
	    scan = new Scanner(System.in);
	    DecimalFormat fmt = new DecimalFormat();
	
	    int occupied = 0;              // Number of occupied suites on the floor
		int totalOccupied = 0;       // Total number of occupied suites
	
		double occupancyRate;        // % of the suites that are occupied
	
		// Get and validate occupancy information for each floor
		System.out.println("Enter the number of occupied suites on each of the following floors.\n");
	
		for (int floor = MIN_FLOOR; floor <= MAX_FLOOR; floor++)
		{
			if (floor == 13) continue;		  // Skip thirteenth floor
			
			System.out.println("\nFloor " + floor+ ": "); 
			occupied = scan.nextInt();										
			while (occupied < 0 || occupied > SUITES_PER_FLOOR)// fixed logical confusion must be OR rather than AND 
			{
				System.out.println("\nThe number of occupied suites must be between 0 and " +  SUITES_PER_FLOOR ); 
				System.out.println("\n Re-enter the number of occupied suites on floor "  + floor + ": ");
				occupied = scan.nextInt();
			}
		  
			// Add occupied suites on this floor to the total
			totalOccupied += occupied;
		}
		
		// Compute occupancy rate in % form
		occupancyRate = 100 * (double)totalOccupied / (double) TOTAL_SUITES;	//fixed bug by int division
		
		// Display results
		
		System.out.println("\n\nThe hotel has a total of " + TOTAL_SUITES + " suites.\n");
		System.out.println(totalOccupied+ " are currently occupied.\n");
		System.out.println("This is an occupancy rate of " + fmt.format(occupancyRate)+ "% \n");
		
		
		total_occupied = totalOccupied;
		occupancy_rate = occupancyRate;
			
		}
}

