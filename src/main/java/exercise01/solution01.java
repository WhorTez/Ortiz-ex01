/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Duane_Ortiz
 */

package exercise01;

import java.util.Scanner;

public class solution01 {
        /* Ask user for name
        read users name
        Output a greeting
         */
        public static void main(String[] args){
            System.out.println("Enter your name: ");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            System.out.println("Hello," + name + " hope you have a great day.");
        }
    }
