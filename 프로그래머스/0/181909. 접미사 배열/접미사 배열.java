import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
       String[] answer = new String[my_string.length()];

        for ( int i=1; i<my_string.length()+1; i++ ) {
            int start = my_string.length() - i;
            int end = my_string.length();
            answer[i-1] = my_string.substring(start, end);;
        }
        Arrays.sort(answer);
        return answer;
    }
}