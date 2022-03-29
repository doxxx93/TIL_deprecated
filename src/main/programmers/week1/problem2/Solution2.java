package programmers.week1.problem2;

import java.util.*;
import java.lang.Math.*;

class Solution2 {

    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        solution(numbers);

    }

    public static String solution(int[] numbers) {

        int[] numbersCopy = numbers;
        int arrayLength = numbers.length;
        int index = 0;
        double[] newNumber = new double[arrayLength];
        String answer = "";

        for(int number : numbers) {
            double doubleNumber = 0;
            if(number < 10) {
                doubleNumber = number * 1000 + 0.4;
            }else if(number < 100) {
                doubleNumber = number * 100 + 0.3;
            }else if(number < 1000) {
                doubleNumber = number * 10 + 0.2;
            }else {
                doubleNumber = number * 1 + 0.1;
            }
            newNumber[index] = doubleNumber;
            // System.out.println(Arrays.toString(newNumber));
            index++;
        }
        Arrays.sort(newNumber);
        for(int i = arrayLength-1; i >= 0; i--) {
            double decimal = newNumber[i] - Math.floor(newNumber[i]);
            decimal = Math.round((decimal * 100)/10.00);
            int originNumber = 0;

            if(decimal >= 4) {
                originNumber = (int) newNumber[i] / 1000;
            }else if(decimal >= 3) {
                originNumber = (int) newNumber[i] / 100;
            }else if(decimal >= 2) {
                originNumber = (int) newNumber[i] / 10;
            }else {
                originNumber = (int) newNumber[i] / 1;
            }
            answer += Integer.toString(originNumber);
            // System.out.println(answer);
        }

        return answer;
    }
}