package com.NumeralConvertersystem;


public class HexadecimalToOtherSystem extends DecimalToOtherSystem {
    /*
       1. Hexadecimal to decimal
       2. Hexadecimal to binary
       3.Hexadecimal to octal
     */

    public  int hexadecimalToDecimal(String num, int current_base, int final_base){
        int ans = 0;
        int last_digit = 0;
        int j = 0;
        for (int i = num.length() - 1; i >= 0 ; i--) {
            char lastChar = num.charAt(i);
            if(lastChar == 'A'){
                last_digit = 10;
            }
            else if(lastChar == 'B'){
                last_digit = 11;

            }
            else if(lastChar == 'C'){
                last_digit = 12;

            }
            else if(lastChar == 'D'){
                last_digit = 13;

            }
            else if(lastChar == 'E'){
                last_digit = 14;

            }
            else if(lastChar == 'F'){
                last_digit = 15;

            }
            else{
                last_digit = Character.getNumericValue(lastChar);

            }
            ans = ans + (int)Math.pow(current_base, j)*last_digit;
            j++;

        }
        return ans;
    }

    public  int hexadecimalToBinary(String num, int current_base, int final_base){
        int decimal_value = hexadecimalToDecimal(num, current_base, final_base);
        HexadecimalToOtherSystem obj = new HexadecimalToOtherSystem();
        return obj.decimalToOther(decimal_value, current_base, final_base);
    }
    public int hexadecimalTOOctal(String num, int current_base, int final_base){
        return 0;

    }

}
