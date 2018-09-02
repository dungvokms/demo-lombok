package vn.dung;

import lombok.val;
import lombok.var;

public class DemoValAndVar {

    public static void main(String[] args) {

        // ------------------ val ---------------------
        val a = 10;

        //a = 11; // ==> error
        // --------------------------------------------

        var b = "Hello";
        b = "Hello there"; // valid

        System.out.println(b.getClass().getSimpleName());   // ==> String
    }
}
