import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> intArr = new ArrayList<>();
        for ( String str : intStrs ) {
            int start = Math.max(0, s);
            int end = Math.min(str.length(), start + l);
            int value = Integer.parseInt(str.substring(start, end));
            if ( k < value ) intArr.add(value);
        }
        int[] answer = intArr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}