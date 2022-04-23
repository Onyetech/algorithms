package com.ikennascode;

public class BinarySearch {
    public static int main(String[] args) {
        int numbers[] = {2,4,6,7,8,0,9};

        for (int i = 0; i < 7; i++) {
            if (numbers[i] == 0) {
                System.out.println("the number 0 found");
                return 0;

            }
        }
        System.out.println("Not found");
        return 1;
    }

}

