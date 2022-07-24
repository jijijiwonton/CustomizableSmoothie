package Customization;

import java.util.HashMap;

public record Customization(Ingredients[] ingredients, boolean isExtra, boolean isLess, boolean isAllergic, PowderIngredient isPowderAdded, ToppingIngredient isToppingAdded) implements Menu {

	static HashMap<Customization, Ingredient[]> c = new HashMap<Customization, Ingredient[]>();
	
	@Override
	public void addMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashMap<NonCustomaziable, Ingredient[]> menuForNonCutomizableSmoothie() {
		// TODO Auto-generated method stub
		return null;
	}
}
