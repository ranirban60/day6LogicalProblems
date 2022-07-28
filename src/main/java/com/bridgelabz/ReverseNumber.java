package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    static int answer =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number");
        int number = sc.nextInt();
        System.out.println(reverseUsingIteration(number));
        recursiveFunc(number);
        System.out.println(answer);
    }

    static int reverseUsingIteration(int number){
        int result =0;
        while(number>0){
            int remainder = number%10;
            result = result * 10 +remainder;
            number = number/10;
        }
        return result;
    }
    private static void recursiveFunc(int number) {
    if(number==0) return;
    int remainder = number%10;
    answer = answer *10+ remainder;
    number = number/10;
    recursiveFunc(number);
    }
}
