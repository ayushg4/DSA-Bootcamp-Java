package com.kunal;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);  // now each value gets added to the previous one
                               // without creating a new string in each iteration
        }

        System.out.println(builder.toString());  // prints it as a string

        builder.reverse();   // many such methods available

        System.out.println(builder);
    }
}
