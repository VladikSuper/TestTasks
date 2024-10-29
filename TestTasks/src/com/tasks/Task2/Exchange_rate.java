package com.tasks.Task2;
import java.util.Scanner;

class Exchange_rate {
    private static final double USD_RATE = 0.39;  // курс из BYN в доллар США
    private static final double EUR_RATE = 0.36;  // курс из BYN в евро
    private static final double GBP_RATE = 0.32;  // курс из BYN в фунт стерлингов
    private static final double JPY_RATE = 57.89; // курс из BYN в японскую иену
    private static final double CNY_RATE = 2.82;  // курс из BYN в китайский юань

    public static double convert(double amount, double rate) {
        return amount * rate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сумму в белорусских рублях (BYN) для конвертации: ");
        double amount = sc.nextDouble();

        System.out.println("\nКонвертация валют:");
        System.out.println("В доллары США (USD): " + convert(amount, USD_RATE));
        System.out.println("В евро (EUR): " + convert(amount, EUR_RATE));
        System.out.println("В фунты стерлингов (GBP): " + convert(amount, GBP_RATE));
        System.out.println("В японские иены (JPY): " + convert(amount, JPY_RATE));
        System.out.println("В китайские юани (CNY): " + convert(amount, CNY_RATE));
    }
}
