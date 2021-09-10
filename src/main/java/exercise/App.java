package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

       Scanner input = new Scanner(System.in);
       System.out.print("How many euros are you exchanging? ");
       String firstString = input.next();
       int euros = Integer.parseInt(firstString);

       System.out.print("What is the exchange rate? ");
       String secondString = input.next();
       double exchangeRate = Double.parseDouble(secondString);

       double dollars = euros * exchangeRate;
       dollars = (double)Math.round(dollars * 100d) / 100d;

       System.out.println(euros + " euros at an exchange rate of " + exchangeRate + " is " + dollars + " U.S. dollars.");

    }
}
