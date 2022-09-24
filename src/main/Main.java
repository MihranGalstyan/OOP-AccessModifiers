package main;

import models.Man;

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
    }
}
