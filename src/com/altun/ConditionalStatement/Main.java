package com.altun.ConditionalStatement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Write a code that keeps a number from the user and generates an integer between 1 and 7
    // and displays the name of the weekday.
    // Test Data - Input Number: 5 - Expected Output: Friday

        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        int day = input.nextInt();

        System.out.println("It's " + getDayName(day) + "! Have a nice Weekend ;)");
    }

    // How to get the name for the week

    public static String getDayName (int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
            }
            return dayName;
        }
    }

