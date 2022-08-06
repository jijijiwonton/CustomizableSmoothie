package Customization;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Order {

	Scanner input = new Scanner(System.in);

	// Declare menu options
	public static final int QUIT_PROGRAM = 0;
	public static final int ORDER_SMOOTHIE = 1;
	public static final int NON_CUSTOMIZATION = 2;
	public static final int CUSTOMIZED = 3;

	public void OrderSmoothie() throws OutOfMenuException {

		int userInput = _orderingSystem();

		String smoothie;
		
		switch(userInput) {
		case QUIT_PROGRAM:
			System.out.println("Thanks for using Customized smoothie program");
			break;
		case ORDER_SMOOTHIE:
			System.out.println(NON_CUSTOMIZATION + " : Order non-customized smoothie");
			System.out.println(CUSTOMIZED + " : Order customized smoothie");
			
			int smoothieOption = input.nextInt();
			
			if(smoothieOption == CUSTOMIZED) {
				smoothie = _orderCustomizedSmoothie();
				System.out.println(smoothie);
			} else if(smoothieOption == NON_CUSTOMIZATION) {
				smoothie = _orderNonCustomizedSmoothie();
				System.out.println(smoothie);
			} else {
				throw new OutOfMenuException("Only non-customization (2) OR customized (3) available :)");
			}
		}
	}

	/**
	 * A private helper method to give an option to user
	 * @return
	 * @throws OutOfMenuException 
	 */
	private int _orderingSystem() throws OutOfMenuException {
		int option;
		
		System.out.println("Welcome to Healthy & Organic Smoothie world");
		System.out.println("Please, enter your input and enjoy our smoothie!" + "\n");
		System.out.println(QUIT_PROGRAM + " :  Quit program");
		System.out.println(ORDER_SMOOTHIE + " : Order smoothie");
		
		// User option whether quitting program or ordering smoothies
		option = input.nextInt();
		
		// Validation when users input a wrong option
		if(option != QUIT_PROGRAM && option != ORDER_SMOOTHIE) {
			throw new OutOfMenuException("Only quit program (0) OR order smoothie (1) available :)");
		}
		
		return option;
	}

	/**
	 * A private helper function to order customized smoothie
	 * @return
	 * @throws OutOfMenuException 
	 */
	private String _orderCustomizedSmoothie() throws OutOfMenuException {
		// All available ingredients list for customized smoothie
		List<Ingredient> ingredientList = new Ingredients().IngredientsList();
		System.out.println(ingredientList + "\n");

		// Asking for user to choose how many ingredients for the smoothie
		System.out.println("How many ingredients would you like to put for your smoothie?");
		int numberOfOptions = input.nextInt();

		Ingredient selectedMainIngredient = null;
		int userOption = 0;
		Ingredient[] total = new Ingredient[numberOfOptions];

		// Based on numberOfOptions, users can choose ingredients
		for(int i = 0; i < numberOfOptions; i++) {
			System.out.println("Please enter ingredients number (from 0) :)");
			userOption = input.nextInt();
			
			// Validation when users input a wrong option
			if(userOption > ingredientList.size()) {
				throw new OutOfMenuException("The ingredient number doesn't exist. Please check the number, starting from 0");
			}
			
			selectedMainIngredient = ingredientList.get(userOption);

			// Display for users to check what they selected
			System.out.println(selectedMainIngredient);
			total[i] = selectedMainIngredient;
		}

		// Asking for user to choose Powder and Topping
		System.out.println("Please enter Powder ingredients added or not (from 0) :)");
		List<PowderIngredient> powderList = new Ingredients().powderIngredientList();
		System.out.println(powderList);
		userOption = input.nextInt();
		
		// Validation when users input a wrong option
		if(userOption > powderList.size()) {
			throw new OutOfMenuException("The powder number doesn't exist. Please check the number, starting from 0");
		}
		
		PowderIngredient selectedPowder = powderList.get(userOption);

		System.out.println("Please enter Topping ingredients added or not (from 0) :)");
		List<ToppingIngredient> toppingList = new Ingredients().toppingIngredientList();
		System.out.println(new Ingredients().toppingIngredientList());
		userOption = input.nextInt();
		
		// Validation when users input a wrong option
		if(userOption > toppingList.size()) {
			throw new OutOfMenuException("The topping number doesn't exist. Please check the number, starting from 0");
		}
		
		ToppingIngredient selectedTopping = toppingList.get(userOption);

		// Asking for user to choose blend level
		System.out.println("Please enter Blend level (from 0) :)");
		List<BlendLevel> blendLevel = new Ingredients().blendLevelList();
		System.out.println(new Ingredients().blendLevelList());
		userOption = input.nextInt();
		
		// Validation when users input a wrong option
		if(userOption > blendLevel.size()) {
			throw new OutOfMenuException("The blend level number doesn't exist. Please check the number, starting from 0");
		}
		
		BlendLevel blendLev = blendLevel.get(userOption);

		Customization c = new Customization(Arrays.asList(selectedPowder), Arrays.asList(selectedTopping), Arrays.asList(blendLev), Arrays.asList(total));
		return c.getCusomizedSmoothieDetails(c);
	}

	/**
	 * A private helper function to order non-customized smoothie
	 * @throws OutOfMenuException 
	 */
	private String _orderNonCustomizedSmoothie() throws OutOfMenuException {
		// All available menu for non-customized smoothie
		List<NonCustomaziable> menu = new NonCustomization().menu();

		System.out.println(menu + "\n");

		System.out.println("What would you like to order?");
		System.out.println("Please enter smoothie number (from 0) :)");
		
		int userOption = input.nextInt();

		// Validation when users input a wrong option
		if(userOption > menu.size()) {
			throw new OutOfMenuException("The non-customized menu number doesn't exist. Please check the number, starting from 0");
		}
		
		NonCustomaziable selectedSmoothie = menu.get(userOption);
		
		System.out.println();

		return "***** Non customized smoothie *****" + "\n" +
			   "Smoothie    : " + selectedSmoothie.name() + "\n" +
			   "Ingredients : " + selectedSmoothie.ingredients + "\n" + 
			   "Calories    : " + selectedSmoothie.calories;
	}
}