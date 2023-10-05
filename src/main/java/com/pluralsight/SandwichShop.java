package com.pluralsight;
import java.util.*;
public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What size sandwich would you like?");
        String sizeprice = scanner.nextLine();

        double Rprice = 5.45;
        double Lprice = 8.95;

        System.out.println("1. Regular: base price $" + Rprice);
        System.out.println("2. Large: base price $" + Lprice);

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        int Student = 17;
        int Senior = 65;
        double discount = .10;
        double discountprice = Rprice * discount;

        System.out.println("-Students (" + Student + "years old or younger)-receive a 10% discount");
        System.out.println("-Seniors (" + Senior + "years old or older)-receive a 20% discount");

        double answer = Rprice - discountprice;

        System.out.print("Cost of sandwhich is $" + answer);




    }
}
