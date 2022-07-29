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
	// TODO: Admin only for special menu
	public void addMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	// TODO: Admin only for special case
	public void deleteMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashMap<NonCustomaziable, String[]> menuForNonCutomizableSmoothie() {
		HashMap<NonCustomaziable, String[]> s = new HashMap<NonCustomaziable, String[]>();
		return s;
	}
	/**
	 * Get smoothie ingredients calorie info
	 * @param Enum for calorie
	 * @return calorie
	 */
//	public List<Double> getSmoothieCalorie(NonCustomaziable calorie) {
//		switch(calorie) {
//		case EchoOfDevil:
//			double[] ed = {Ingredient.Acai.calorie, Ingredient.Apple.calorie, Ingredient.Apricot.calorie};
//			double total = calculateCalories(ed);
//			NonCustomization.calorie.put(NonCustomaziable.EchoOfDevil, total);
//			return Arrays.asList(NonCustomization.calorie.get(NonCustomaziable.EchoOfDevil));
//		case GreenParty:
//			double[] gp = {Ingredient.Avocado.calorie, Ingredient.Apple.calorie, Ingredient.Banana.calorie};
//			total = calculateCalories(gp);
//			NonCustomization.calorie.put(NonCustomaziable.GreenParty, total);
//			return Arrays.asList(NonCustomization.calorie.get(NonCustomaziable.GreenParty));
//		case GreenSun:
//			double[] gs = {Ingredient.Kiwi.calorie, Ingredient.Blueberry.calorie, Ingredient.Peach.calorie};
//			total = calculateCalories(gs);
//			NonCustomization.calorie.put(NonCustomaziable.GreenSun, total);
//			return Arrays.asList(NonCustomization.calorie.get(NonCustomaziable.GreenSun));
//		case HappyDessert:
//			double[] hd = {Ingredient.Dates.calorie, Ingredient.Pear.calorie, Ingredient.Peach.calorie};
//			total = calculateCalories(hd);
//			NonCustomization.calorie.put(NonCustomaziable.HappyDessert, total);
//			return Arrays.asList(NonCustomization.calorie.get(NonCustomaziable.HappyDessert));
//		case RedParty:
//			double[] rp = {Ingredient.Acai.calorie, Ingredient.Apple.calorie, Ingredient.Apricot.calorie};
//			total = calculateCalories(rp);
//			NonCustomization.calorie.put(NonCustomaziable.RedParty, total);
//			return Arrays.asList(NonCustomization.calorie.get(NonCustomaziable.RedParty));
//		case VitaminBooster:
//			double[] vb = {Ingredient.Acai.calorie, Ingredient.Apple.calorie, Ingredient.Apricot.calorie};
//			total = calculateCalories(vb);
//			NonCustomization.calorie.put(NonCustomaziable.VitaminBooster, total);
//			return Arrays.asList(NonCustomization.calorie.get(NonCustomaziable.VitaminBooster));
//		case YellowParty:
//			double[] yp = {Ingredient.Kiwi.calorie, Ingredient.Blueberry.calorie, Ingredient.Peach.calorie};
//			total = calculateCalories(yp);
//			NonCustomization.calorie.put(NonCustomaziable.YellowParty, total);
//			return Arrays.asList(NonCustomization.calorie.get(NonCustomaziable.YellowParty));
//		default:
//			break;
//		}
//		return null;
//	}

	/**
	 * Calculate all ingredient's calories
	 * @param totalIngredients
	 * @return total calories
	 */
	public double calculateCalories(double[] totalIngredients) {
		double total = 0;
		for(int count = 0; count < totalIngredients.length; count++) {
			total += totalIngredients[count];
		} return total;
	}
}
