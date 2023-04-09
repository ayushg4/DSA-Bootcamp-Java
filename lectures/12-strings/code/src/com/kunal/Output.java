package com.kunal;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("Kunal");
        
        System.out.println(new int[]{2, 3, 4, 5});
        // prints a random code like I@43553
        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5}));
        // prints a proper array
        // here we are overriding the default java method by describing our method
        
         String name = null;
     System.out.println(name);          // prints null
        
    Integer num = new Integer(56);
        // creating wrapper class
    System.out.println(num.toString());  // diff such functions can be used now on integer
      System.out.println(num);       // prints "56"
    }
}
