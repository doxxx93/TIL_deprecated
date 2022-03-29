package programmers.week1.problem2;

class Solution3 {

    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        solution(numbers);

    }
    public static String solution(int[] numbers) {
        String answer = "";
        int temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        int answerLen = answer.length();
        int[] newAnswer = new int[answerLen];


        for(int j = 0; j < answerLen; j++) {
            newAnswer[j] += Integer.valueOf(answer.substring(j,j+1));
            //System.out.println("문자열길이 : " + Integer.valueOf(answer.substring(j,j+1)));
        }

        String newAnswer1 = "";
        int max = 0;
        for(int k = 0; k < newAnswer.length; k++) {
            for(int s = k + 1; s < newAnswer.length; s++) {
                if(newAnswer[k] < newAnswer[s]) {
                    temp = newAnswer[k];
                    newAnswer[k] = newAnswer[s];
                    newAnswer[s] = temp;
                }
            }

            newAnswer1 += newAnswer[k];
        }

        return newAnswer1;
    }
}
