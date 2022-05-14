package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 1;
        System.out.print("Perfect numbers between 1 and 10000 are: ");
        for (int i = 2; i < 10000; i++) {
            sum = 1;
            for (int j = 2; j < i; j++)

                if (i % j == 0)
                    sum = sum + j;
            if (sum == i) {
                System.out.print(i + " ");

            }
        }
        System.out.println();
    }
}
