package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int num1,num2;
        Calculadora calc = new Calculadora();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros para serem somados: ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();

        
        System.out.println("A soma dos numeros é: " + calc.Somador(num1,num2));
    }
}