package com.kunal;

// overloading done when function name is same
// but datatype/number of prameters are different 

// which method is to be executed is decided at compile time
// according to the values that is provided while calling the function

public class Overloading {
    public static void main(String[] args) {
//        fun(67);
//        fun("Kunal Kushwaha");
      int ans = sum(3, 4, 78);
        System.out.println(ans);
        
//       fun(); // error, bcz now compiler don't know which one to run
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
