package assignment.day10.restaurant;

public class MainRestaurant {

	public static void main(String[] args) {
		Counter counter = new Counter();
		new Waiter(counter);
		new Kitchen(counter);

	}

}
