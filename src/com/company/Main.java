package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] names = new String [3];
        names[0] = "Mike";
        names[1] = "Jack";
        names[2] = "Billy";

        int greeting = 1;
        switch (greeting) {
            case 1:
                System.out.println("Good morning " + names[0]);

            case 2:
                System.out.println("Good afternoon " + names[1]);

             case 3:
                System.out.println("Good evening " + names[2]);
                

        }




    }


}
