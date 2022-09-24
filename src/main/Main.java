package main;

import models.Man;
import test.myMath;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        Man man1 = new Man("Hanna", 27);
        man1.showInfo();

        man1.setAge(18);
        man1.setName("Georg");
        man1.showInfo();

        System.out.println("--------");

        System.out.println(myMath.square(20));

        System.out.println(myMath.length(10));

        System.out.println("--------");

        System.out.println(myMath.sum(10,25,47,89));
    }
}
