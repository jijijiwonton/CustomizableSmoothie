package Customization;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Order {

	Scanner input = new Scanner(System.in);

	public static final int QUIT_PROGRAM = 0;
	public static final int ORDER_SMOOTHIE = 1;
	public static final int NON_CUSTOMIZATION = 2;
	public static final int CUSTOMIZED = 3;

	public void OrderSmoothie() {

		int userInput = _orderingSystem();
		String smoothie;
		switch(userInput) {
		case CUSTOMIZED:
			System.out.println("Thanks for using our Customized smoothie program!");
			break;
		case ORDER_SMOOTHIE:
			System.out.println(NON_CUSTOMIZATION + " : Order non-customized smoothie");
			System.out.println(CUSTOMIZED + " : Order customized smoothie");
			int smoothieOption = input.nextInt();
			if(smoothieOption == 3) {
				smoothie = _orderCustomizedSmoothie();
				System.out.println(smoothie);
			} else if(smoothieOption == 2) {
				smoothie = _orderNonCustomizedSmoothie();
				System.out.println(smoothie);
			} else {
				throw new Error("Please check available options :)");
			}
		}
	}

	/**
	 * A private helper method to give an option to user
	 * @return
	 */
	private int _orderingSystem() {
		int option;
		System.out.println("Welcome to Healthy & Organic Smoothie world");
		System.out.println("Please, enter your input and enjoy our smoothie!");
		System.out.println("             ***************");
		System.out.println(QUIT_PROGRAM + " :  Quit program");
		System.out.println(ORDER_SMOOTHIE + " : Order smoothie");
		option = input.nextInt();
		return option;
	}

	/**
	 * A private helper function to order customized smoothie
	 * @return
	 */
	private String _orderCustomizedSmoothie() {
		// All available ingredients list for customized smoothie
		List<Ingredient> ingredientList = new Ingredients().IngredientsList();
		System.out.println(ingredientList);

		// Asking for user to choose how many ingredients for the smoothie
		System.out.println("How many ingredients would you like to put for your smoothie?");
		int numberOfOptions = input.nextInt();

		Ingredient selectedOption = null;
		int userOption = 0;
		Ingredient[] total = new Ingredient[numberOfOptions];

		// Based on numberOfOptions, save user's preferenced ingredients
		for(int i = 0; i < numberOfOptions; i++) {
			System.out.println("Please enter ingredients number (from 0) :)");
			userOption = input.nextInt();
			selectedOption = ingredientList.get(userOption);

			// Display for users to check what they selected
			System.out.println(selectedOption);
			total[i] = selectedOption;
		}

		// TODO: Customization for other options should be refactoring
		Customization c = new Customization(PowderIngredient.Nothing, ToppingIngredient.Mint, BlendLevel.Well_Blended, Arrays.asList(total));
		return c.getCusomizedSmoothieDetails(c);
	}

	/**
	 * A private helper function to order non-customized smoothie
	 */
	private String _orderNonCustomizedSmoothie() {
		// All available menu for non-customized smoothie
		List<NonCustomaziable> menu = new NonCustomization().menu();

		System.out.println(menu);

		System.out.println("What would you like to order?");
		System.out.println("Please enter smoothie number (from 0) :)");
		int userOption = input.nextInt();

		// Save customer selected non-customized smoothie
		NonCustomaziable selectedSmoothie = menu.get(userOption);

		return "***** Non customized smoothie *****" + "\n" +
			   "Smoothie    : " + selectedSmoothie.name() + "\n" +
			   "Ingredients : " + selectedSmoothie.ingredients;
	}
}