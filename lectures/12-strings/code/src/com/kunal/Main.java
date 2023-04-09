package com.kunal;

// strings are immutable bcz of security reasons
public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 19};
        int num = 10;
        String name = "Kunal Kushwaha";
//        System.out.println(name);

        String a = "Kunal";
        System.out.println(a);    // prints Kunal
        a = "Kushwaha";           // now a will point to diff object - kushwaha
        System.out.println(a);   // prints kushwaha
    }
}
