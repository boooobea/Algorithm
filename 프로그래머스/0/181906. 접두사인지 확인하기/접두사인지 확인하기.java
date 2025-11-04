class Solution {
    public int solution(String my_string, String is_prefix) {
        String[] my = my_string.split("");
        String[] is = is_prefix.split("");
        if ( my.length < is.length ) return 0;

        for(int i = 0; i < is.length; i++) {
            if ( ! is[i].equals(my[i]) ) return 0;
        }
        return 1;
    }
}