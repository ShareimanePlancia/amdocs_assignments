package activity.exception.day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Price {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numberItems =0;
        
        System.out.println("Enter number of items: ");
        try {
            numberItems = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Please enter an integer only");
        }
        
        int price[] = new int[numberItems];
        for(int i = 0; i< numberItems; i++) {
            System.out.println("Please enter the Price: " +(i+1));
            try {
                price[i] = sc.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Please enter an integer only");
            }
        }	  
        
        int index = 0;
        System.out.println("Enter index: ");
        try {
            index = sc.nextInt();
        System.out.println("Price: "+price[index-1]);
        }catch(InputMismatchException e){
            System.out.println("Please enter an integer only");
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index "+index+" out of bounds for length "+price.length);
        }
   }
}


