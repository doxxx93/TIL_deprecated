package programmers.week1.problem2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.*;

class Solution {

    public String solution(int[] numbers) {
        String answer = IntStream.of(numbers)
            .mapToObj(String::valueOf)
            .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
            .collect(Collectors.joining());

        if (answer.startsWith("0")){ return "0";}


        return answer;
    }
}

//class Solution {
//
//    public String solution(int[] numbers) {
//        String[] strNums = new String[numbers.length];
//
//        for (int i = 0; i < numbers.length; i++) {
//            strNums[i] = "" + numbers[i];
//        }
//
//        Arrays.sort(strNums, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
//
//        String answer = "";
//        for (String s : strNums) {
//            answer += s;
//        }
//        if (answer.startsWith("0"){
//            return "0";
//        }
//        return answer;
//    }
//}

//        /*for (int i = 0; i < strNums.length; i++) {
//            for (int j = i + 1; j < strNums.length; j++) {
//                String s1 = strNums[i];
//                String s2 = strNums[j];
//                if ((s1 + s2).compareTo(s2 + s1) < 0) {
//                    strNums[i] = strNums[j];
//                    strNums[j] = s1;
//                }
//            }
//        */}
