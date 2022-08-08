package Customization;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class CustomizationTest {
	
	Customization c;
	/**
	 * Verify getting customized smoothie details
	 * smoothie ingredients(main, powder, topping), blend level, smoothie calories, smoothie price
	 */
	@Test
	void testGetCusomizedSmoothieDetails() {
		// Actual smoothie information
		String[] actualIngredients = {"Kiwi", "BloodOrange", "Avocado", "Apricot", "Acai"};
		String actualPowder = "Cinamon";
		String actualTopping = "Mint";
		String actualBlendLev = "Well_Blended";
		double actualCalories = 257;
		double actualPrice = 7.3;
		
		List<Ingredient> expectedIngredients = Arrays.asList(Ingredient.Kiwi, Ingredient.BloodOrange, Ingredient.Avocado, Ingredient.Apricot, Ingredient.Acai);
		List<PowderIngredient> expectedPowder = Arrays.asList(PowderIngredient.Cinamon);
		List<ToppingIngredient> expectedTopping = Arrays.asList(ToppingIngredient.Mint);
		List<BlendLevel> expectedBlendLev = Arrays.asList(BlendLevel.Well_Blended);
		
		c = new Customization(expectedPowder, expectedTopping, expectedBlendLev, expectedIngredients);
		
		String actualDetails = "***** Customized smoothie *****\n"
				+ "Ingredients : [[Kiwi, BloodOrange, Avocado, Apricot, Acai]]\n"
				+ "Powder      : [[Cinamon]]\n"
				+ "Topping     : [[Mint]]\n"
				+ "Blend Level : [[Well_Blended]]\n"
				+ "Calories    : 257.0\n"
				+ "Price       : $7.3";
		
		String expectedDetails = c.getCusomizedSmoothieDetails(c);
		
		assertEquals(expectedDetails, actualDetails);
	}
}
