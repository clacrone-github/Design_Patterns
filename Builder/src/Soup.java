import java.util.ArrayList;
import java.util.ListIterator;

public abstract class Soup {
	
	ArrayList soupIngredients = new ArrayList();
	String soupName;
	
	public String getSoupName() {
		return this.soupName;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(" Ingredients: ");
		ListIterator ingredientIterator = soupIngredients.listIterator();
		
		while (ingredientIterator.hasNext()) {
			result.append((String)ingredientIterator.next());
		}
		
		return result.toString();
	}
}
