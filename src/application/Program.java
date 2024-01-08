package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o preço do dolar ?");
        CurrencyConverter.dolarPrice = sc.nextDouble();
        System.out.println("Quantos dolares você quer ?");
        CurrencyConverter.dolar = sc.nextDouble();
        System.out.println("Você vai pagar: " + CurrencyConverter.conversão());

        sc.close();
    }
}