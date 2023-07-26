package org.example.Module;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int add(int ... a){
        int temp=0;
        for(int i:a){
            temp+=i;
        }
        return temp;
    }
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Ctrl+D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Cmd+F8.
////            System.out.println("i = " + i);
//        }
        System.out.println(add(3,4,5,6,7,8));
        List a = new ArrayList();
        a.add("abc");
        a.add(11);
        a.add(11.11);
        a.add('d');
        System.out.println(a);
    }
}