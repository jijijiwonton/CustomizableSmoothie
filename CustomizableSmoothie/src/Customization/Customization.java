package Customization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public record Customization(PowderIngredient powderAdded, ToppingIngredient toppingAdded, BlendLevel blendLevel, Ingredient...ingredients) implements Menu {

	// Default Constructor
	public Customization() {
		this(null, null, null, new Ingredient[0]);
	}

	@Override
	public List<NonCustomaziable> menu() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getCusomizedSmoothieDetails(Customization c) {
		return "***** Customized smoothie *****" + "\n" +
	           "Ingredients : " +Arrays.asList(c.ingredients()) + "\n" +
			   "Powder      : " + c.powderAdded() + "\n" +
	           "Topping     : " + c.toppingAdded() + "\n" +
			   "Blend Level : " + c.blendLevel();
	}
}