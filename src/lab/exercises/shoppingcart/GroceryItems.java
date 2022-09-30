package lab.exercises.shoppingcart;

public class GroceryItems {
	  private String category;
	    private int id;
	    private String items;
	    private double price;
	    private int qty;
	    public GroceryItems(int id, String category, String items, double price, int qty) {
	        super();
	        this.id = id;
	        this.category = category;
	        this.items = items;
	        this.price = price;
	        this.qty = qty;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getCategory() {
	        return category;
	    }



	    public void setCategory(String category) {
	        this.category = category;
	    }



	    public String getItems() {
	        return items;
	    }



	    public void setItems(String items) {
	        this.items = items;
	    }



	    public double getPrice() {
	        return price;
	    }



	    public void setPrice(double price) {
	        this.price = price;
	    }



	    public int getQty() {
	        return qty;
	    }



	    public void setQty(int qty) {
	        this.qty = qty;
	    }



	    @Override
	    public String toString() {
	        return "Basket [Category=" + category + ", Items=" + items + ", Price=" + price + ", Qty=" + qty + "]";
	    }

	}