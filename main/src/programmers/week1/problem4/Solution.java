package programmers.week1.problem4;

import java.util.Arrays;

class Solution {

    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int index = B.length - 1;

        int answer = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] < B[index]) {
                index--;
                answer++;
            }
        }
        return answer;
    }
}


//    public int solution(int[] A, int[] B) {
//        Arrays.sort(B);
//
//        int answer = 0;
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < B.length; j++) {
//                if (A[i] < B[j]) {
//                    answer++;
//                    B[j] = 0;
//                    break;
//                }
//            }
//        }
//        return answer;
//    }


