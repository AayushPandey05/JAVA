import java.util.Scanner;

//!...Updated Switch Case in java 12..
//! Method - 1

public class updatedswitch {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Day(0 to 7): ");
        int day = scn.nextInt();

        String res = "";

        switch (day) {
            case 1 -> res = "Monday";
            case 2 -> res = "Tuesday";
            case 3 -> res = "Wednesday";
            case 4 -> res = "Thursday";
            case 5 -> res = "Friday";
            case 6 -> res = "Saturday";
            case 7 -> res = "Sunday";

            default -> System.out.println("Invalid date choosen!");
        }

        System.out.println(res);
    }
}


//!..Method -2 

import java.util.Scanner;

public class updatedswitch {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Day(0 to 7): ");
        int day = scn.nextInt();

        String res = "";

        res = switch (day) 
        {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid date choosen!";
        };

        System.out.println(res);
    }
}