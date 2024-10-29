package com.tasks.Task3;
import java.util.Random;
import java.util.Scanner;

public class Password_Generator {
    public static int passwordLength () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Password Generator");
        System.out.print("Enter the password length (from 8 to 12): ");

        int lenPassword = sc.nextInt();
        while (lenPassword < 8 || lenPassword > 12) {
            System.out.print("The password length should be between 8 and 12, try again: ");
            lenPassword = sc.nextInt();
        }
        return lenPassword;
    }

    public static char getRandomCharacter() {
        Random random = new Random();
        char[] passwordCharacters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5',
                '6', '7', '8', '9', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_'};

        int index = random.nextInt(passwordCharacters.length);
        return passwordCharacters[index];
    }

    public static void main(String[] args) {

        int lenPassword = passwordLength();


            char[] password = new char[lenPassword];
            for (int i = 0; i < lenPassword; i++) {
                password[i] = getRandomCharacter();
            }

            System.out.print("Generated password: " + new String(password));
    }
}
