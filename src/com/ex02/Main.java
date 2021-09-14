/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input_val = new Scanner(System.in);
        String user_inp;
        System.out.println("What is the inout string?");
        user_inp = input_val.next();
        int str_len = user_inp.length();
        System.out.println(user_inp + " has " + str_len + " characters.");
    }
}
