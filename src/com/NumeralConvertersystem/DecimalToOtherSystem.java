package com.NumeralConvertersystem;

import java.util.ArrayList;

import static com.NumeralConvertersystem.BinaryToOtherSystem.binaryToHexadecimal1;

public class DecimalToOtherSystem {

    /*
        1. Decimal to binary
        2. Decimal to octal
        3. Decimal to Hexadecimal

     */
    public static void main(String[] args) {
        System.out.println(decimalToOther(15, 10, 2));
    }

    public static int decimalToOther(int num, int current_base, int final_base){
        ArrayList<Integer> list = new ArrayList<>();
        int ans = 0;

        int rem = 0;
        while(num != 0){
            rem = num % final_base;
            list.add(rem);
            num = num / final_base;
        }

        for (int i = list.size() - 1 ; i >= 0 ; i--) {
            ans = ans*10 + list.get(i);
        }
        return ans;
    }


    public static String decimalToHexadecimal(int num, int current_base, int final_base){
        if(num == 10){
            return "A";
        }
        else if(num == 11){
            return "B";
        }
        else if(num == 12){
            return "C";
        }
        else if(num == 13){
            return "D";
        }
        else if(num == 14){
            return "E";
        }
        else if(num == 15){
            return "F";
        }
        else {
            return binaryToHexadecimal1( num, current_base,  final_base );
        }

    }


}
