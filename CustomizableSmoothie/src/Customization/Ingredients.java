package Customization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Ingredient {
	Water(Quantity.HalfGlass, 0, 0),
	Milk(Quantity.HalfGlass, 0, 0),
	AlmondMilk(Quantity.HalfGlass, 0, 0),
	SoyMilk(Quantity.HalfGlass, 0, 0),
	Acai(Quantity.OneScoop, 40, 2.5),
	Apple(Quantity.Half, 40, 1),
	Apricot(Quantity.One, 17, 0.8),
	Avocado(Quantity.OneScoop, 80, 1.5),
	Banana(Quantity.One, 100, 2),
	BloodOrange(Quantity.OneQuarter, 20, 1),
	Blueberry(Quantity.OneScoop, 40, 2.5),
	Dates(Quantity.One, 20, 0.7),
	Kiwi(Quantity.One, 100, 1.5),
	Lemon(Quantity.HalfGlass, 10, 1.5),
	Mango(Quantity.Half, 100, 1.5),
	Peach(Quantity.Half, 30, 2),
	Pear(Quantity.Half, 50, 2);
	
	Ingredient(Quantity q, double c, double p) {
		this.quantity = q;
		this.calorie = c;
		this.price = p;
	};

	public static Quantity getQuantity(Ingredient igd) {
		return igd.quantity;
	}

	public static double getCalories(Ingredient igd) {
		return igd.calorie;
	}

	public static double getPrice(Ingredient igd) {
		return igd.price;
	}

	Quantity quantity;
	double calorie;
	double price;
}

enum Quantity {
	One,
	Half,
	OneQuarter,
	OneScoop,
	HalfGlass
}

enum PowderIngredient {
	Nothing,
	Chocolate,
	Cinamon,
	Matcha,
	Greentea,
	Ginger
}

enum ToppingIngredient {
	Nothing,
	Mint
}

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

	/**
	 * Get available main ingredients list
	 * @return main ingredients
	 */
	public List<Ingredient> IngredientsList() {
		return Arrays.asList(Ingredient.values());
	}

	/**
	 * Get available powder ingredients
	 * @return powder ingredients
	 */
	public List<PowderIngredient> powderIngredientList() {
		return Arrays.asList(PowderIngredient.values());
	}

	/**
	 * Get available topping ingredients
	 * @return topping ingredients
	 */
	public List<ToppingIngredient> toppingIngredientList() {
		return Arrays.asList(ToppingIngredient.values());
	}

	/**
	 * Get Blend level options
	 * @return blend level
	 */
	public List<BlendLevel> blendLevelList() {
		return Arrays.asList(BlendLevel.values());
	}
};
