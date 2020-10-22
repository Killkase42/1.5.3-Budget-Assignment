/*
*Nick
*October 22, 2020
* ICS4U
* Mr. Hofstatter
* Budget Assignment
* A program used to calculate percentages of budget spent on different things.
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Creating variables.
        Scanner scan = new Scanner (System.in);

        String name;
        double earnings;
        double food;
        double clothing;
        double entertainment;
        double cellphone;

        //Acquiring user's name.
        System.out.println("Enter your name below.");
        name = scan.nextLine();

        //Acquiring user's spendings on different things.
        System.out.println("How much money did you make last month?");
        earnings = scan.nextDouble();

        System.out.println("How much did you spend on food last month?");
        food = scan.nextDouble();

        System.out.println("How much did you spend on clothing last month?");
        clothing = scan.nextDouble();

        System.out.println("How much did you spend on entertainment last month?");
        entertainment = scan.nextDouble();

        System.out.println("How much did you spend on your cell phone last month?");
        cellphone = scan.nextDouble();

        //Telling the user the percentage of their earning they spent on various things, rounded to two decimal places.
        System.out.println("Comrade " + name + ", this is a summary of your spending pattern.");
        System.out.println("");
        System.out.println("    Category        Budget");
        System.out.println("    -------------   ------");
        System.out.println("    Food            " + (double) Math.round((food /  earnings * 100) * 100) / 100 + "%" );
        System.out.println("    Clothing        " + (double) Math.round((clothing /  earnings * 100) * 100) / 100 + "%" );
        System.out.println("    Entertainment   " + (double) Math.round((entertainment /  earnings * 100) * 100) / 100 + "%" );
        System.out.println("    Cell Phone      " + (double) Math.round((cellphone /  earnings * 100) * 100) / 100 + "%" );

        //Telling the user their expenses and saving and what percent of their total earnings they are, rounded to two decimal places.
        System.out.println("");
        System.out.println("Your expenses total $" + (double) Math.round((food + clothing + entertainment + cellphone) * 100) / 100 + " or " + (double) Math.round((food + clothing + entertainment + cellphone) / earnings * 10000) / 100 + "% of your earnings.");
        System.out.println("Your savings are $" + (double) Math.round((earnings - (food + clothing + entertainment + cellphone)) * 100) / 100 + " or " + (double) Math.round(((earnings - (food + clothing + entertainment + cellphone)) / earnings * 100) * 100) / 100 + "% of your earnings.");

    }

}
