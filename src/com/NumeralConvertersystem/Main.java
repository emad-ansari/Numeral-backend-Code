package com.NumeralConvertersystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int current_base;
        int final_base;
        int number;
        String hexNumber;


        System.out.println("Enter the current base: ");
        current_base = in.nextInt();
        System.out.println("Enter the final base: ");
        final_base = in.nextInt();
        System.out.println("Enter the number: ");

        DecimalToOtherSystem obj1 = new DecimalToOtherSystem();
        HexadecimalToOtherSystem obj2 = new HexadecimalToOtherSystem();
        OctalToOtherSystem obj3 = new OctalToOtherSystem();
        BinaryToOtherSystem obj4 = new BinaryToOtherSystem();


        switch (current_base) {
            case 10 -> {
                switch (final_base) {
                    case 2, 8 -> {
                        number = in.nextInt();
                        System.out.println(obj1.decimalToOther(number, current_base, final_base));
                    }
                    case 16 -> {
                        number = in.nextInt();
                        System.out.println(obj1.decimalToHexadecimal(number, current_base, final_base));
                    }
                }
            }
            case 2 -> {
                switch (final_base) {
                    case 10 -> {
                        number = in.nextInt();
                        System.out.println(obj4.binaryToDecimal(number, current_base));
                    }
                    case 8 -> {
                        number = in.nextInt();
                        System.out.println(obj4.binaryToOctal(number, current_base, final_base));
                    }
                    case 16 -> {
                        number = in.nextInt();
                        System.out.println(obj4.binaryToHexadecimal(number, current_base, final_base));
                    }
                }
            }
            case 8 -> {
                switch (final_base) {
                    case 2 -> {
                        number = in.nextInt();
                        System.out.println(obj3.octalToBinary(number, current_base, final_base));
                    }
                    case 10 -> {
                        number = in.nextInt();
                        System.out.println(obj3.octalToDecimal(number, current_base, final_base));
                    }
                    case 16 -> {
                        number = in.nextInt();
                        System.out.println(obj3.octalToHexadecimal(number, current_base, final_base));
                    }
                }
            }
            case 16 -> {
                switch (final_base) {
                    case 2 -> {
                        hexNumber = in.next();
                        System.out.println(obj2.hexadecimalToBinary(hexNumber, current_base, final_base));
                    }
                    case 10 -> {
                        hexNumber = in.next();
                        System.out.println(obj2.hexadecimalToDecimal(hexNumber, current_base, final_base));
                    }
                    case 8 -> {
                        hexNumber = in.next();
                        System.out.println(obj2.hexadecimalTOOctal(hexNumber, current_base, final_base));
                    }
                }
            }
        }
    }
}
