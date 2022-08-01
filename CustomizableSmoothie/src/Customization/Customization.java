package Customization;

import java.util.Arrays;
import java.util.List;

public record Customization(PowderIngredient powderAdded, ToppingIngredient toppingAdded, BlendLevel blendLevel, List<Ingredient> ingredients) implements Menu {

	@Override
	public List<NonCustomaziable> menu() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Display details info of customized smoothie by customer
	 * @param c
	 * @return customized smoothie info
	 */
	public String getCusomizedSmoothieDetails(Customization c) {
		return "***** Customized smoothie *****" + "\n" +
	           "Ingredients : " +Arrays.asList(c.ingredients()) + "\n" +
			   "Powder      : " + c.powderAdded() + "\n" +
	           "Topping     : " + c.toppingAdded() + "\n" +
			   "Blend Level : " + c.blendLevel();
	}
}