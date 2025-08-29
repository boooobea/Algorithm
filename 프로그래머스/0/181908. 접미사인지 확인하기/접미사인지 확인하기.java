class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for ( int i = 1; i < my_string.length()+1; i++ ) {
            String suffix = my_string.substring(my_string.length()-i, my_string.length());
            if ( suffix.equals(is_suffix) ) { answer = 1; }
        }
        return answer;
    }
}