package exercise03.base;

    /*
        UCF COP3330 Fall 2021 Assignment 1 Solution
        Copyright 2021 first_name last_name
    */

import java.util.Scanner;

public class Solution03 {

    /*
    print: "What is the quote? "
    'quote': read the string from the user
    print: "Who said the quote? "
    'name': read the string from the user
    print: "'name' says, "'quote'""
     */

    public static void main(String[] args) {

        System.out.println("What is the quote? ");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();

        System.out.println("Who said the quote? ");
        Scanner input2 = new Scanner(System.in);
        String name = input2.nextLine();

        System.out.println(name + " says, \"" + quote + "\"");

    }





}
