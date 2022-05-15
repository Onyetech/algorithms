package com.ikennascode.string.in.java.abc;

public class CountVowlsConstsAndSpChrs {

    public static void main(String[] args) {

        String x = "JameS' BRILLIANCE CENTER";
        x = x.toLowerCase();
        char y[] = x.toCharArray();
        int size = y.length;

        int vowels = 0;
        int consonants = 0;
        int specialCharacters = 0;

        int i = 0;

        while ( i != size)
        {
            if (y[i] >= 'a' && y[i] <= 'z'){
                if (y[i] == 'a' || y[i] == 'i' || y[i] == 'o' || y[i] == 'e' || y[i] == 'u')
                {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
            else {
                specialCharacters++;
            }
            ++i;

        }
        System.out.println(y);
        System.out.println("Vowels " +vowels);
        System.out.println("Consonants " +consonants);
        System.out.println("Special Characters " +specialCharacters);

    }

}
