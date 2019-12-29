package at.htl.exercise.ifelse;

import java.util.Scanner;

public class CheckCharType {

    // Write a program to check whether a character is an alphabet, digit or special character
    // Tip:
    //      48-57   digits (0, 1, ..., 9)
    //      65-90   Upper case alphabetic (A, B, ..., Z)
    //      97-122  Lower case alphabetic (a, b, ..., z)

    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Get first character of input string
        System.out.print("Character: ");
        char next = scanner.nextLine().charAt(0);
    }
}