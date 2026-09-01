class Solution {
    public String minWindow(String s, String t) {

        if (t.length() > s.length()) {
            return "";
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = 0;

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            if (map.containsKey(c)) {

                if (map.get(c) > 0) {
                    count++;
                }

                map.put(c, map.get(c) - 1);
            }

            while (count == t.length()) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char removed = s.charAt(left);

                if (map.containsKey(removed)) {

                    map.put(removed, map.get(removed) + 1);

                    if (map.get(removed) > 0) {
                        count--;
                    }
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}