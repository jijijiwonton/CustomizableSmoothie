package Customization;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

interface Menu {
	
	public void addMenu();
	
	public void deleteMenu();

	HashMap<NonCustomaziable, Ingredient[]> menuForNonCutomizableSmoothie();
}
