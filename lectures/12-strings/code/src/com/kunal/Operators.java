package com.kunal;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');  // prints sum of both ASCII
        System.out.println("a" + "b");  // concatenates
        System.out.println((char)('a' + 3)); // prints d  

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());  // prints kunal[]
        System.out.println("Kunal" + new Integer(56));   // prints kunal56
        
        String ans = new Integer(56) + "" + new ArrayList<>(); // prints 56[]
        System.out.println(ans);           // only works when "" added in between
 // + operator works only for primitive datatypes or when there is a string involved

        System.out.println("a" + 'b');   // returns ab
    }
}
