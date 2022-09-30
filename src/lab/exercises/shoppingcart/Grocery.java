package lab.exercises.shoppingcart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Grocery {
	
	public static Double totalGroceryAmount = 0.0;
	public static HashMap<String, Double> groceryItemsAmount = new HashMap<String, Double>();
	public static HashMap<String, List<GroceryItems>> groceryItemsPerCategory= new HashMap<String, List<GroceryItems>>();
	public static List<GroceryItems> baskets = new ArrayList<>();
	public static List<String> categories = new ArrayList<>();
	
public static void main(String[] args) {
		
		// add to cart
		 addToCart(new GroceryItems(1,"Electronics","Laptop",35000.00,2));
		 addToCart(new GroceryItems(2,"Kids Items","Shoes",350.00,3));
		 addToCart(new GroceryItems(3,"Electronics","Cellphone",20000.00,1));
		 addToCart(new GroceryItems(4,"Grocery","Milk",250.00,4));
		 addToCart(new GroceryItems(5,"Kids Items","Pants",100.00,3));
		 addToCart(new GroceryItems(6,"Grocery","Egg",190,12));
		 //print details
		 System.out.println("\nInitial item.. ");
		 printDetails();
		 //remove item
		 removeToCart(1);
		 //print details
		 System.out.println("\nAfter removed one item.. ");
		 printDetails();
		 //add item
		 addToCart(new GroceryItems(7,"Grocery","Milk",190,12));
		 //print details
		 System.out.println("\nAfter add one item.. ");
		 printDetails();
}
	
	public static void printDetails() {
	    // to print the list of grocery per category, loop the hashmap and get the list of grocery per category
	    for (int i = 0; i < groceryItemsPerCategory.size(); ++i) {
	        System.out.println("Category: "+categories.get(i));
	        for (GroceryItems groceryItem : groceryItemsPerCategory.get(categories.get(i))) {
	            System.out.println("\tItem: "+groceryItem.getItems()+" Price: "+groceryItem.getPrice());
	        }
	    }

	    // to print, loop the hashmap to get the total amount of each category
	    System.out.println("\nTotal per category: ");
	    for (int i = 0; i < categories.size(); ++i) {
	        System.out.println("Category: "+categories.get(i)+" Amount: "+groceryItemsAmount.get(categories.get(i)));
	    }
	    System.out.println("Total Amount: "+totalGroceryAmount);
	}

	public static void addToCart(GroceryItems grocery) {
	    baskets.add(grocery);
	    processGroceries();
	}

	public static void removeToCart(int id) {
	    baskets.removeIf(basket -> basket.getId() == id);
	    processGroceries();
	}

	public static  void getDistinctCategoryList(){
	    categories =  baskets.stream().map(m -> m.getCategory()).distinct().collect(Collectors.toList());
	}

	public static void processGroceries(){
	    // get the distinct category
	    getDistinctCategoryList();
	    for (int i = 0; i < categories.size(); ++i) {
	        List<GroceryItems> basketsPerCategory = new ArrayList<>();
	        Double totalAmount = 0.0;
	        // loop the grocery items to add the total amount per category in the hashmap
	        for (GroceryItems basket : baskets) {
	            if (basket.getCategory() == categories.get(i)) {
	                totalAmount += basket.getPrice();
	                basketsPerCategory.add(basket);
	            }
	        }
	        totalGroceryAmount += totalAmount;
	        groceryItemsAmount.put(categories.get(i),totalAmount);
	        groceryItemsPerCategory.put(categories.get(i),basketsPerCategory );
	    }
	}
}