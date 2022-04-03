/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mumexercises;

import java.util.*;

/**
 *
 * @author User
 */
public class Filter {
    public static void main(String[] args) {
        List<Integer> myArray = new ArrayList<>();
        
        myArray.add(16);
        myArray.add(1);
        myArray.add(20);
        
//        System.out.println("Before sort:" + myArray);
//        
//        Collections.sort(myArray);
//        System.out.println("after sort:" + myArray);
//        Collections.sort(myArray, Collections.reverseOrder());
//        System.out.println("after sort ascending Order:" + myArray);
        
        
        
        
//        ArrayList<String> list = new ArrayList<String>();   
//        // adding elements to the ArrayList   
//        list.add("Volkswagen");   
//        list.add("Toyota");   
//        list.add("Porsche");   
//        list.add("Ferrari");   
//        list.add("Mercedes-Benz");   
//        list.add("Audi");   
//        list.add("Rolls-Royce");  
//        list.add("BMW");  
//        
//        // printing the unsorted ArrayList   
//        System.out.println("Before Sorting: "+ list);   
//        Collections.sort(list);
//        System.out.println("after Sorting: "+ list); 
        
        
        
//        List<String> list = new ArrayList<String>();
//        list.add("How are you");
//        list.add("How you doing");
//        list.add("Joe");
//        list.add("Mike");
//
//        
//        if(list.contains("Mike")){
//            list.remove(list.indexOf("Mike"));
//            System.out.println("mike removed");
//            
//            System.out.println(list);
//        }
        
        
        List<Integer> al = new ArrayList<>();
 
        // Adding elements to our ArrayList
        // using add() method
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);
        
        // Printing the current ArrayList
        System.out.println(al);
 
        // Creating iterator object
        Iterator itr = al.iterator();
 
        // Holds true till there is single element
        // remaining in the object
        while (itr.hasNext()) {
 
            // Remove elements smaller than 10 using
            // Iterator.remove()
            int x = (Integer)itr.next();
            if (x == 10)
                itr.remove();
        }
 
        // Printing the updated ArrayList
        System.out.println(al);
        
//        assending order
        
        Collections.sort(al);
        System.out.println(al);
        
        
        
        
    }
}
