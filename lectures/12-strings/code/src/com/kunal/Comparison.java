package com.kunal;

public class Comparison {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";
        String c = a;
      System.out.println(c == a);  // returns True
        
        // == compares both the values and also whether their ref variables point to same 
        // .equals() checks value only
        
    System.out.println(a == b);  // returns True

        String name1 = new String("Kunal");  // this way Kunal is created outside the string pool
                                             // in heap memory
        String name2 = new String("Kunal");   // both are at different addresses

        System.out.println(name1 == name2);  // returns False

        System.out.println(name1.equals(name2)); //  returns True
        
        System.out.println(name1.charAt(0));
        // to get a single character from a string

    }
}
