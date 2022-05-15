package com.ikennascode.string.in.java.abc;

public class ContainsInteger {

    public static void main(String[] args) {

        String x = "Age/120/9370Ikennajf@";
        x = x.toLowerCase();
        char y[] = x.toCharArray();

        int size = y.length;
        int letters = 0;
        int numbers = 0;
        int specialCharacters = 0;

        int i = 0;
        while (i != size) {
            if (y[i] >= '0' && y[i] <= '9'){
                numbers++;
            }
           else if (y[i] >= 'A' && y[i] <= 'Z'){

                letters++;
            }
            else specialCharacters++;
            ++i;
        }

        System.out.println(x);
        System.out.println("this is it letters no " +letters);
        System.out.println("Special characters " +specialCharacters);
        System.out.println("numbers " +numbers);
        System.out.println("Hiiiiiiii");
    }


}
