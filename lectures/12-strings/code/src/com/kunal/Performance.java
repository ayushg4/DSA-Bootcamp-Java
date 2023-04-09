package com.kunal;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch; // series += ch 
               
        }

        System.out.println(series);
          // prints abcdefghij...z
        // not a good method bcz in each iteration a new string is being created
        // while the pevious one is left behind wasting memory
        
        // so therefore we use StringBuilder
    }
}
