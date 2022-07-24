package Customization;

import java.util.HashMap;

public record Customization(Ingredients ingredients, boolean isExtra, boolean isLess, boolean isAllergic, Ingredients isPowderAdded, Ingredients isToppingAdded) {
	
}
