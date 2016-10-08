import static org.junit.Assert.*;

import org.junit.Test;

public class HotelOccupancyTest 
{
	
	/*
	 * Note path 1 and path 2 are logically impossible since the values that 
	 * determine the path are hard coded as "final" they never change 
	 * and as such the program will never deviate from the main path that is 
	 * as covered by Path3, Path4 , and Path 5
	 * 
	 */

	@Test
	public void testPath3() 
	{
		// input parameters are (6,5,6,5,6,5,6,5)
		HotelOccupancy testHotel = new HotelOccupancy();
		testHotel.calcRate();
		
		assertEquals(33, testHotel.total_occupied);
		assertEquals(27.5, testHotel.occupancy_rate, 0.1);
	}
	
	@Test
	public void testPath4()
	{
		// input parameters are (6,5,-1,5,6,5,6,5)
		// Note you will get an error message 
		//and you should input a 6 for the -1 after reading message
		HotelOccupancy testHotel = new HotelOccupancy();
		testHotel.calcRate();
		
		assertEquals(33, testHotel.total_occupied);
		assertEquals(27.5, testHotel.occupancy_rate, 0.1);
	}
	
	@Test
	public void testPath5()
	{
		// input parameters are (6,5,100,5,6,5,6,5)
		// Note you will get an error message 
		//and you should input a 6 for the 100 after reading message
		HotelOccupancy testHotel = new HotelOccupancy();
		testHotel.calcRate();
		
		assertEquals(33, testHotel.total_occupied);
		assertEquals(27.5, testHotel.occupancy_rate, 0.1);
		
	}

}
