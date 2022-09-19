package JavaDay1_Assignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment1 {

	    public static void main(String[] args) {
	        String input = "aabbbbeeeeffggg";
	        String output = new String("");
	        
	        HashMap<Character,Integer> charMap= new HashMap<>();
	        for(char ch:input.toCharArray()){
	            if(!charMap.containsKey(ch))
	            {
	                charMap.put(ch,1);
	            }else{
	                int freq= charMap.get(ch);
	                charMap.put(ch,freq+1);
	            }
	        }
	        
	        for(Map.Entry<Character,Integer> entry:charMap.entrySet()){
	            if (entry.getValue() == 1) {
	                output += String.valueOf(entry.getKey());
	            } else {
	            	output = output +  String.valueOf(entry.getKey())+entry.getValue();
	               //output += String.valueOf(entry.getKey())+entry.getValue();
	            }
	        }
	    
	        System.out.println("output "+output);
	         
	    }
	
}
