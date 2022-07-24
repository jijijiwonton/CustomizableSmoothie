package Customization;

import java.util.ArrayList;

public class Ingredients {
	
	ArrayList<String[]> igd = new ArrayList<String[]>();
	ArrayList<SpecialIngredients> seasonal = new ArrayList<SpecialIngredients>();

	/**
	 * Determine the ingredient is seasonal or not
	 * @param ingreName
	 * @return If the ingredient is seasonal return true, otherwise false
	 */
//	public boolean isSeasonal(String ingredient) {
//		
//	}
	
	/**
	 * Add seasonal ingredient
	 * @param ingredient
	 */
	public void seasonalIngredients(SpecialIngredients ingredient) {
		seasonal.add(ingredient);
		
	}
	
	/**
	 * Get seasonal ingredient
	 * @return seasonal ingredient list
	 */
	public ArrayList<SpecialIngredients> viewSeasonalIngredients() {
		return seasonal;
	}

	protected void nonCustomizableSmoothie(String[] ingredients) {
		igd.add(ingredients);
	}
};
