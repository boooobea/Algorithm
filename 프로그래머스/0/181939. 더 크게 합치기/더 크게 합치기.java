class Solution {
    public int solution(int a, int b) {
        String val1 = String.valueOf(a) + String.valueOf(b);
        String val2 = String.valueOf(b) + String.valueOf(a);

        int answer = Integer.max(Integer.parseInt(val1), Integer.parseInt(val2));
        return answer;
    }
}