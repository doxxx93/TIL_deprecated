package programmers.week1.problem1;

class Solution {

    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int si = 0;
        int position = 1;
        while (position <= n) {
            if (si < stations.length && stations[si] - w <= position) {
                position = stations[si] + w + 1;
                si++;
            } else {
                answer += 1;
                position += w * 2 + 1;
            }
        }
        return answer;
    }

//        int answer = 0;
//        Queue<Integer> sq = new LinkedList<>();
//        for (int s : stations) {
//            sq.offer(s);
//        }
//        int position = 1;
//        while (position <= n) {
//            if (sq.isEmpty() && sq.peek() - w <= position) {
//                position = sq.poll() + w + 1;
//            } else {
//                position += w * 2 + 1;
//                answer += 1;
//            }
//        }
//        return answer;
//    }
}
