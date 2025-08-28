class Solution {
    public String solution(String str1, String str2) {
        char[] arrStr1 = str1.toCharArray();
        char[] arrStr2 = str2.toCharArray();
        String answer = "";

        for (int i = 0; i < arrStr1.length; i++) {
            answer += String.valueOf(arrStr1[i]);
            answer += String.valueOf(arrStr2[i]);
        }
        return answer;
    }
}