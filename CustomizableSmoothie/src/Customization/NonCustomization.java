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
	}

	public static ArrayList<Ingredient> getIngredients(Ingredient...ingredients) {
		return new ArrayList<Ingredient>(Arrays.asList(ingredients));
	}

	ArrayList<Ingredient> ingredients;
}

public record NonCustomization() implements Menu {
	
	static HashMap<NonCustomaziable, String[]> name = new HashMap<NonCustomaziable, String[]>();
	static HashMap<NonCustomaziable, Double> calorie = new HashMap<NonCustomaziable, Double>();
	
	@Override
	public List<NonCustomaziable> menu() {
		return Arrays.asList(NonCustomaziable.values());
	}
}
