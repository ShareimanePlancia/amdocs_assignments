package assignment.collections.day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Library {
    public static ArrayList<Member> members = new ArrayList<Member>();
    public static Map<Integer,String> map=new HashMap<Integer,String>();
    
    public static void main(String[] args) {
        
        initializeValue();
        displayMenu();
        
        
    }
    
    static void initializeValue(){
        Member a = new Member();
        a.id = 1;
        a.name = "Rita Sue";
        a.address = "Pasig" ;
        
        Member b = new Member();
        b.id = 2;
        b.name = "Mark Liu" ;
        b.address = "Makati";
        
        Member c = new Member();
        c.id = 3 ;
        c.name = "Chris Ty";
        c.address = "Pasig";
        members.add(a);
        members.add(b);
        members.add(c);
        
        map.put(1, "Add New Member");  
        map.put(2, "View Member");  
        map.put(3, "View Member By Address");
    }
    
    static Member addNewMember() {
        Member member = new Member();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input ID: ");
        member.id = sc.nextInt();
        System.out.print("Input name: ");
        member.name = sc.next();
        System.out.print("Input address: ");
        member.address = sc.next();
        System.out.println("Added new member details "+member.toString());
        
        return member;
    }
    
    static void showMemberDetails(){
        for (Member m : members) {
            System.out.println(m);
        }
    }
    
    static void showMemberDetailsByAddress(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input address: ");
        String address = sc.next();
        
        List<Member> filteredMembers = members.stream()
                .filter(string -> string.address.contains(address))
                .collect(Collectors.toList());
               if (filteredMembers != null && filteredMembers.size() != 0) {
                   for (Member member : filteredMembers) {
                       System.out.print("ID: "+member.id+" Name: "+member.name+" Address: "+member.address+"\n");
                   }
               } else {
                   System.out.println("No members found on the given address");
               }
               
              
           }
    
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
                    Member newMember = addNewMember();
                    members.add(newMember);
                    System.out.print("\nAdded new member details ID: "+newMember.id+" Name: "+newMember.name+" Address: "+newMember.address+"\n");
                    displayMenu();
                } else if (operationId == 2) {
                    showMemberDetails();
                    displayMenu();
                } else {
                    showMemberDetailsByAddress();
                    displayMenu();
                }
            }
        } catch(InputMismatchException e) {
            System.out.print("Only integer value is allowed");
        }
        
    }
}
