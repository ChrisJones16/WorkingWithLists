package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<String> nameList;
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	// an array list is mutable meaning you can take away and add things

        Main mainClass = new Main();
        mainClass.testingLists();
    }

    private void testingLists() {

        nameList = new ArrayList<String>();

        nameList.add("Chris");
        nameList.add("Bhris");
        nameList.add("TommyBoy");
        nameList.add("JhonnyBoy");

        System.out.println("See all items in the array list:");
        for (String name : nameList) {
            System.out.print(name);
        }

        System.out.println("See a single item in the array list:");
        System.out.println(nameList.get(2));

        System.out.println("Remove a single item and list what is left in the Array List: ");
        nameList.remove(0);

        for (String name : nameList) {
            System.out.print(name);
        }

        System.out.println("Viewing ArrayList using iteration loop with numbers");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println((i + 1) + " " + nameList.get(i));
        }

        System.out.println("Which number would you like to remove?");
        int numberToRemove = input.nextInt() - 1;

        if(numberToRemove >= nameList.size() || numberToRemove < 0) {
            System.out.println("That is not a valid number");
        } else {
            nameList.remove(numberToRemove);
        }

        System.out.println("List after take out selected number");
        for (int i = 0; i < nameList.size(); i++) {

            System.out.println((i + 1) + " " + nameList.get(i));
        }

    }

}
