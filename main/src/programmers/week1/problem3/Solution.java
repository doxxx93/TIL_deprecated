package programmers.week1.problem3;

import java.util.Arrays;

class Solution {

    public int solution(int[] budgets, int M) {
        // 이분탐색을 위한 조건인 "정렬"
        Arrays.sort(budgets);

        long sum = 0;
        for (int b : budgets) {
            sum += b;
        }
        if (sum <= M) {
            return budgets[budgets.length - 1];
        }

        int answer = 0;
        int start = 0;
        int end = budgets[budgets.length - 1];
        int mid;
        while (start <= end) {
            sum = 0;
            mid = (start + end) / 2;

            for (int i = 0; i < budgets.length; i++) {
                if (budgets[i] < mid) {
                    sum += budgets[i];
                } else {
                    sum += mid;
                }
            }
            if (sum > M) {
                end = mid - 1;
            } else {
                start = mid + 1;
                answer = Math.max(answer, mid);
            }
        }
        return answer;
    }
}
