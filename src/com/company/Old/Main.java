package com.company.Old;

public class Main {
    public static void main(String[] args) {


        Person johnSmith = new Person ("John Smith");
        Person sarahConnor = new Person("Sarah Connor");

        System.out.println(johnSmith.getFirstName());
        System.out.println(sarahConnor.getFullName());
        johnSmith.setFirstName("Patrik");
        System.out.println(johnSmith.getFirstName());
    }
}
