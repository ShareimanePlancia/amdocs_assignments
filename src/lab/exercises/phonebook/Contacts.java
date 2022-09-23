package lab.exercises.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import assignment.collections.day6.Member;

public class Contacts {
	public static ArrayList<Phonebook> phone = new ArrayList<Phonebook>();
	public static Map<Integer,String> map=new HashMap<Integer,String>();

	public static void main(String[] args) {
        initializeValue();
        displayMenu();
	}

	  static void initializeValue(){
        map.put(1, "Add Contacts");  
        map.put(2, "View all Contacts");  
        map.put(3, "Delete Contact");
        map.put(4, "Search Contact");
	  }
	  
	  //Add Contacts
	   static Phonebook addNewContact() {
	        Phonebook phone = new Phonebook();
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter name: ");
	        phone.name= sc.nextLine();
	        System.out.print("Enter number: ");
	        phone.numbers = sc.nextLine();
	        System.out.println("Added new member details "+phone.toString());
	        
	        return phone;
	    }
	   
	   //View all Contacts
	    static void showContactDetails(){
	    	if (phone.size() > 0)  {
		        for (Phonebook c : phone) {
		            System.out.println(c);
		        }
	    	}else {
	    		System.out.println("No records.");
	    	}

	        
	    	
	    }
	    
	    //Search Contact
	        static void showContactDetailsByNumber(){
	            Scanner sc = new Scanner(System.in);
	     
	            System.out.print("Input contact number: ");
	            String numbers = sc.next();
	            
	            List<Phonebook> filteredContacts = phone.stream()
	                    .filter(string -> string.numbers.contains(numbers))
	                    .collect(Collectors.toList());
	                    if (filteredContacts != null && filteredContacts.size() != 0) {
	                       for (Phonebook contact : filteredContacts) {
	                           System.out.print("Contact name: "+contact.name+ "Contact number: "+contact.numbers+"\n");
	                       }
	                   } else {
	                       System.out.println("No contact found on the given number");
	                   }   
	    }
	        
	     //Delete Contact   
	        static void deleteByName(String name) {
	        	Scanner sc = new Scanner(System.in);
	        	System.out.println("Enter name: ");
	        	name = sc.next();
	        	
	        	  for (Iterator<Phonebook> iterator = phone.iterator(); iterator.hasNext();) {
	        	    Phonebook temp = iterator.next();
	        	   
	        	    if (temp.getName().equalsIgnoreCase(name)) {
	        	      iterator.remove();
	        	      return;
	        	    }
	        	  }

	        	  System.out.println("No contact with name " + name + " was found.");
	        	}
	   //Display Menu
	        static void displayMenu() {
	            Scanner sc = new Scanner(System.in);
	            int operationId;
	            
	            System.out.print("Menus\n");
	            for(Map.Entry<Integer,String> m:map.entrySet()){  
	               System.out.print( "ID: "+m.getKey()+" Operation: "+m.getValue()+"\n");  
	            }  
	            try{
	                System.out.print("Input id of the desired operation from the menu: ");
	                operationId = sc.nextInt();
	                
	                Iterator<Map.Entry<Integer, String> >
	                iterator = map.entrySet().iterator();
	                boolean isKeyPresent = false;
	                while (iterator.hasNext()) {
	                    Map.Entry<Integer, String> entry = iterator.next();
	                    if (operationId == entry.getKey()) {
	                        isKeyPresent = true;
	                    }
	                }
	                
	                if (!isKeyPresent) {
	                    System.out.print("Operation id does not exists");
	                } else {
	                    if (operationId == 1) {
	                        Phonebook newContact = addNewContact();
	                        phone.add(newContact);
	                        System.out.print("\nAdded new contact number: "+newContact.name+" Number: "+newContact.numbers+"\n");
	                        displayMenu();
	                    } else if (operationId == 2) {
	                    	showContactDetails();
	                        displayMenu();
	                        
	                    } else if(operationId == 3) {
	                    	deleteByName(null);
	                        displayMenu();
	                    	  
	                    } else {
	                    	showContactDetailsByNumber();
	                        displayMenu();
	                    }
	                }
	            } catch(InputMismatchException e) {
	                System.out.print("Only integer value is allowed");
	            }
	        }
}
