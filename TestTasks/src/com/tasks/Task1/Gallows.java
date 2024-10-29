package com.tasks.Task1;
import java.util.Random;
import java.util.Scanner;

public class Gallows{

    private static final String[] WORD = {"hello", "home", "down"};
    private static final int MAX_NUBMER_MOVES = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String wordToGuess = WORD[rand.nextInt(WORD.length)];
        char[] guessedWord = new char[wordToGuess.length()];
        StringBuilder usedLetters = new StringBuilder();



        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int remainingMoves = MAX_NUBMER_MOVES;
        boolean guessed = false;

        while (remainingMoves > 0 && !guessed) {
            System.out.print("Word: ");
            printWord(guessedWord);
            System.out.println("There are " + remainingMoves + " attempts left");
            System.out.print("Entry letter: ");
            char letter = sc.nextLine().toLowerCase().charAt(0); ///////////////////////////////////////////////////////
            System.out.println();

            if (checkUsedLetters(usedLetters.toString(), letter)) {
                System.out.println("This letter has already been used, try another one");
                continue;
            }
            usedLetters.append(letter);

            if (wordToGuess.indexOf(letter) != -1) {
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == letter) {
                        guessedWord[i] = letter;
                    }
                }
            }
            else {
                remainingMoves--;
                System.out.println("The wrong letter\n");
            }

            guessed = isWordGuessed(guessedWord);
        }

        if (guessed) {
            System.out.println("Congratulations! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("You've lost. The hidden word was: " + wordToGuess);
        }

    }

    public static void printWord(char[] word) {
        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i] + " ");
        }
        System.out.println();
    }

    public static boolean checkUsedLetters(String usedLetters, char letter) {
        for (int i = 0; i < usedLetters.length(); i++) {
            if (usedLetters.charAt(i) == letter) {
                return true;
            }
        }
        return false;
    }

    private static boolean isWordGuessed(char[] guessedWord) {
        for (int i = 0; i < guessedWord.length; i++) {
            if (guessedWord[i] == '_') {
                return false;
            }
        }
        return true;
    }
}
