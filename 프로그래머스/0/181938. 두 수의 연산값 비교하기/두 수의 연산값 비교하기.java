class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        //1. a + b
        int value1 = Integer.valueOf(a + "" + b);
        //2 2 * a * b
        int value2 = 2 * a * b;
        answer = Math.max(value1, value2);
        return answer;
    }
}