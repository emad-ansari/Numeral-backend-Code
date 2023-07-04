package com.NumeralConvertersystem;


import java.util.ArrayList;

public class BinaryToOtherSystem {
    // 1. binary to decimal
    // 2. binary to octal
    // 3. binary to hexadecimal



    public   int binaryToDecimal(int num, int current_base){
        if (num == 0){
            return 0;
        }
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


    public  int binaryToOctal(int num, int current_base, int final_base){
        ArrayList<Integer> list = new ArrayList<>();
        int ans = 0;

        int rem = 0;
        // get the decimal equivalent of binary number and convert it into octal.
        int decimal_value = binaryToDecimal(num, current_base);
        while(decimal_value != 0){
            rem = decimal_value % final_base;
            list.add(rem);
            decimal_value = decimal_value / final_base;
        }

        for (int i = list.size() - 1 ; i >= 0 ; i--) {
            ans = ans*10 + list.get(i);
        }
        return ans;


    }
    // below code is not working properly
    public  String binaryToHexadecimal(int num, int current_base, int final_base ){
        int decimal_value = binaryToDecimal(num, current_base);
        if(decimal_value == 10){
            return "A";
        }
        else if(decimal_value == 11){
            return "B";
        }
        else if(decimal_value == 12){
            return "C";
        }
        else if(decimal_value == 13){
            return "D";
        }
        else if(decimal_value == 14){
            return "E";
        }
        else if(decimal_value == 15){
            return "F";
        }
        else {
            return binaryToHexadecimal1( decimal_value, current_base,  final_base );
        }


    }
    public  String binaryToHexadecimal1(int num, int current_base, int final_base){
        ArrayList<String> list = new ArrayList<>();

        String ans = "";

        int rem = 0;

        while(num != 0){
            rem = num % final_base;
            if(rem == 10){
                list.add("A");

            }
            else if(rem == 11){
                list.add("B");

            }
            else if(rem == 12){
                list.add("C");
            }
            else if(rem == 13){
                list.add("D");
            }
            else if(rem == 14){
                list.add("E");
            }
            else if(rem == 15){
                list.add("F");
            }
            else {
                list.add(Integer.toString(rem));
            }

            num = num / final_base;
        }

        // Now we have the ans in  array list
        for (int i = list.size() -1; i >= 0 ; i--) {
            ans = ans + list.get(i);
        }
        return ans;
    }
}
