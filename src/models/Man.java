package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Man {
    private String name;
    private int age;

    public Man(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(final String name) {
        if (name != null){
            this.name = name;
        } else {
            System.out.println("Name can not be NULL");
        }
    }

    public void setAge(final int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age can not be smaller than 0");
        }
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
