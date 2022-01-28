package org.lectures;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = {1,2,3,14,5,6};
        int max_number = findMaxNumber(numbers);

        System.out.println(max_number);
        int min_number = findMinNumber(numbers);

        System.out.println(min_number);
        System.out.println(reverseString("maniac"));
        System.out.println(reverseStrings("maniac"));
    }
    public static int findMaxNumber(int[] array){

        int max = 0;
        for (int num : array) {
            max = Math.max(max, num);
        }
        return max;
    }
    public static int findMinNumber(int[] array){

        int min = 1;
        for (int num : array)
            min = Math.min(min ,num);
        return min;
    }

    public static String reverseString(String s){
        String reversedString = "";
        for (int i = s.length() - 1; i >= 0; i--)
            reversedString += s.charAt(i);
        return reversedString;
    }

    public static String reverseStrings(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
