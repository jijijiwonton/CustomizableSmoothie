package Customization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public record Customization(List<PowderIngredient> powder, List<ToppingIngredient> topping, List<BlendLevel> blendLevel, List<Ingredient> ingredients) implements Menu {

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
	           "Ingredients : " + Arrays.asList(c.ingredients()) + "\n" +
			   "Powder      : " + Arrays.asList(c.powder()) + "\n" +
	           "Topping     : " + Arrays.asList(c.topping()) + "\n" +
			   "Blend Level : " + Arrays.asList(c.blendLevel()) + "\n" +
	           "Calories    : " + calculateCalories(c.ingredients()) + "\n" +
			   "Price       : " + "$" + calculatePrice(c.ingredients());
	}

	/**
	 * A private helper function to calculate total calories of customized smoothie
	 * @param ingredients
	 * @return totalCalories
	 */
	private double calculateCalories(List<Ingredient> ingredients) {
		double totalCalories = 0;
		
		for(int i = 0; i < ingredients.size(); i++) {
			totalCalories += ingredients.get(i).calorie;
		}
		return totalCalories;
	}
	
	/**
	 * A private helper function to calculate total price of customized smoothie
	 * @param ingredients
	 * @return totalPrice
	 */
	private double calculatePrice(List<Ingredient> ingredients) {
		double totalPrice = 0;
		
		for(int i = 0; i < ingredients.size(); i++) {
			totalPrice += ingredients.get(i).price;
		}
		
		return totalPrice;
	}
}