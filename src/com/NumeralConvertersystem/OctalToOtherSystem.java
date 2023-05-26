package com.NumeralConvertersystem;

import java.util.ArrayList;

import static com.NumeralConvertersystem.DecimalToOtherSystem.decimalToHexadecimal;

public class OctalToOtherSystem {
    /*
        1. Octal to binary
        2. Octal to decimal
        3.Octal to Hexadecimal

     */
    public static void main(String[] args) {
        System.out.println(octalToHexadecimal(18, 8, 16));
    }

    public static String octalToBinary(int num, int current_base, int final_base) {
        int decimal_value = octalToDecimal(num, current_base, final_base);
        if (decimal_value != -1) {
            ArrayList<Integer> list = new ArrayList<>();
            int ans = 0;

            int rem = 0;

            while (decimal_value != 0) {
                rem = decimal_value % final_base;
                list.add(rem);
                decimal_value = decimal_value / final_base;
            }

            for (int i = list.size() - 1; i >= 0; i--) {
                ans = ans * 10 + list.get(i);
            }
            return Integer.toString(ans);
        }

        return "Error!!";

    }

    public static boolean checkOctalDigit(int num){
        int last_digit = 0;
        while (num != 0){
            last_digit = num % 10;
            num = num / 10;
            if(last_digit > 7){
                return false;
            }

        }
        return true;
    }

    public static int octalToDecimal(int num, int current_base, int final_base){
        if (num == 0){
            return 0;
        }

        if(checkOctalDigit(num)){
            int sum = 0;
            int i = 0;
            while(num > 0){
                int last_digit = num % 10;
                sum = sum + (int)Math.pow(current_base, i)*last_digit;
                num = num / 10;
                i++;
            }
            return sum;
        }
        return -1;

    }

    public static String octalToHexadecimal(int num, int current_base, int final_base){
        // first convert octal to decimal followed by decimal to hexadecimal
        if(checkOctalDigit(num)){
            int decimal_value  = octalToDecimal(num,current_base, final_base);
            // now we have decimal value
            return decimalToHexadecimal(decimal_value, current_base, final_base);
        }
        return "Error!!";
    }

}
