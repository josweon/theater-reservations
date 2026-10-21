package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReserveTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.print("Please enter your name: ");
        String input1 = scanner.nextLine();
        String[] reservationName = input1.trim().split(" ");

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String input2 = scanner.nextLine();
        LocalDate reservationDate = LocalDate.parse(input2, formatter);

//        System.out.print(reservationDate);
        // 05/13/2023 -> 2023-05-13

        System.out.print("How many tickets would you like? ");
        String input3 = scanner.nextLine();
        int reservationCount = Integer.parseInt(input3);

//        System.out.println(reservationCount);
        System.out.printf("\n%d ticket(s) reserved for %s under %s, %s\n---",
                reservationCount,
                reservationDate,
                reservationName[1],
                reservationName[0]);

//        System.out.print(reservationName[0] + "\n" + reservationName[1]);
    }
}
