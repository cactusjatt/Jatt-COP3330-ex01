/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.print( "What is your name? " );
        String name;
        name = in.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");

        in.close();
    }
}