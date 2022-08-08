package Customization;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class NonCustomizationTest {
	
	NonCustomization nc = new NonCustomization();

	/**
	 * Verify menu() to display all available non-customized menu
	 */
	@Test
	void testMenu() {
		String[] menuOptions = {"EchoOfDevils", "GreenParty", "GreenSun", "HappyDessert", "RedParty", "YellowParty", "VitaminBooster"};
		
		List<String> actual = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();
		
		// Actual non-customized menu options
		for(int i = 0; i < menuOptions.length; i++) {
			actual.add(menuOptions[i]);
		}
		
		// Expected non-customized menu options
		for(int i = 0; i < nc.menu().size(); i++) {
			expected.add(nc.menu().get(i).toString());
		}
		
		// Verify menu()
		assertEquals(expected, actual);
	}

	/**
	 * Verify getting non-customized smoothie details
	 * smoothie name, smoothie ingredients, smoothie calories, smoothie price 
	 */
	@Test
	void testGetNonCusomizedSmoothieDetails() {
		String actualDetails = "***** Non customized smoothie *****\n"
				+ "Smoothie    : VitaminBooster\n"
				+ "Ingredients : [BloodOrange, Lemon, Apricot, Peach]\n"
				+ "Calories    : 77.0\n"
				+ "Price       : $5.3";
		
		String expectedDetails = nc.getNonCusomizedSmoothieDetails(NonCustomaziable.VitaminBooster);
		
		assertEquals(expectedDetails, actualDetails);
	}
}