package Customization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

enum NonCustomaziable {
	EchoOfDevils(getIngredients(Ingredient.Acai, Ingredient.Banana, Ingredient.Kiwi)),
	GreenParty(getIngredients(Ingredient.Acai, Ingredient.Banana, Ingredient.Kiwi)),
	GreenSun(getIngredients(Ingredient.Blueberry, Ingredient.Apricot, Ingredient.Peach)),
	HappyDessert(getIngredients(Ingredient.Apple, Ingredient.Avocado)),
	RedParty(getIngredients(Ingredient.Apple, Ingredient.Dates)),
	YellowParty(getIngredients(Ingredient.Mango, Ingredient.Lemon)),
	VitaminBooster(getIngredients(Ingredient.BloodOrange, Ingredient.Lemon, Ingredient.Apricot, Ingredient.Peach));

	NonCustomaziable(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
		this.calories = calculateCalories(ingredients);
		this.price = calculatePrice(ingredients);
	}

	/**
	 * Display ingredients of non-customized smoothie
	 * @param ingredients
	 * @return ingredients of non-customized smoothie
	 */
	private static ArrayList<Ingredient> getIngredients(Ingredient...ingredients) {
		return new ArrayList<Ingredient>(Arrays.asList(ingredients));
	}
	
	/**
	 * Calculate total calories
	 * @param ingredients
	 * @return total calories of non-customized smoothie
	 */
	private static double calculateCalories(ArrayList<Ingredient> ingredients) {
		double totalCalories = 0;
		
		for(int i = 0; i < ingredients.size(); i++) {
			totalCalories += ingredients.get(i).calorie;
		}

		return totalCalories;
	}
	
	/**
	 * Calculate total price
	 * @param ingredients
	 * @return total price of non-customized smoothie
	 */
	private static double calculatePrice(ArrayList<Ingredient> ingredients) {
		double totalPrice = 0;
		
		for(int i = 0; i < ingredients.size(); i++) {
			totalPrice += ingredients.get(i).price;
		}
		
		return totalPrice;
	}

	ArrayList<Ingredient> ingredients;
	double calories;
	double price;
}

public record NonCustomization() implements Menu {
	
	static HashMap<NonCustomaziable, String[]> name = new HashMap<NonCustomaziable, String[]>();
	static HashMap<NonCustomaziable, Double> calorie = new HashMap<NonCustomaziable, Double>();
	
	/**
	 * A menu method to display all non-customized smoothie's name
	 * @return NonCustomaziable (Enum)
	 */
	@Override
	public List<NonCustomaziable> menu() {
		System.out.println("***** Non-customized smoothie *****");
		return Arrays.asList(NonCustomaziable.values());
	}
	
	/**
	 * Display details info of non-customized smoothie by customer
	 * @param nc
	 * @return non-customized smoothie info
	 */
	public String getNonCusomizedSmoothieDetails(NonCustomaziable nc) {
		return "***** Non customized smoothie *****" + "\n" +
				   "Smoothie    : " + nc.name() + "\n" +
				   "Ingredients : " + nc.ingredients + "\n" + 
				   "Calories    : " + nc.calories + "\n" +
				   "Price       : " + "$" + nc.price;
	}
}
