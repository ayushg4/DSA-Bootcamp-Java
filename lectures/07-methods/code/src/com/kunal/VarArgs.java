package com.kunal;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun();   prints an empty array
//        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");    
//        demo();
    }

    static void demo(int ...v) {  // allows us to take as many inputs as possible
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
