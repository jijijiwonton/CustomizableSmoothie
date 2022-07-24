package Customization;

import java.util.HashMap;

enum NonCustomaziable {
	EchoOfDevil,
	GreenSun,
	GreenParty,
	RedParty,
	YellowParty,
	VitaminBooster,
	HappyDessert
}

public record NonCustomization() implements Menu {
	
	static HashMap<NonCustomaziable, Ingredient[]> nc = new HashMap<NonCustomaziable, Ingredient[]>();
	
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
	public HashMap<NonCustomaziable, Ingredient[]> menuForNonCutomizableSmoothie() {
		return nc;
	}
	
	public Ingredient[] getSmoothieInfo(NonCustomaziable nc) {
		switch(nc) {
		case EchoOfDevil:
			Ingredient[] echoOfDevil_Ingredient = {Ingredient.Acai, Ingredient.Apple, Ingredient.Apricot};
			this.nc.put(NonCustomaziable.EchoOfDevil, echoOfDevil_Ingredient);
			return this.nc.get(echoOfDevil_Ingredient);
		}
		return null;
	}
}
