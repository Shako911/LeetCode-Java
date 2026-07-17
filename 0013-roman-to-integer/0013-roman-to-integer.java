import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));

            if( i < s.length() - 1 && current < romanMap.get(s.charAt(i+1))) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;


    }
}