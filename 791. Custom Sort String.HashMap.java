import java.util.HashMap;
import java.util.Map;

class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> orderMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        // Populate the orderMap with characters from 'order' and their corresponding indices
        for (int i = 0; i < order.length(); i++) {
            orderMap.put(order.charAt(i), i);
        }

        int[] count = new int[26]; // Assuming only lowercase English letters are present

        // Count occurrences of each character in 's'
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Append characters from 's' according to the order specified in 'order'
        for (char c : order.toCharArray()) {
            int idx = c - 'a';
            while (count[idx] > 0) {
                result.append(c);
                count[idx]--;
            }
        }

        // Append remaining characters from 's' which are not in 'order'
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                result.append((char) (i + 'a'));
                count[i]--;
            }
        }

        return result.toString();
    }
}

/*
class Solution {
    public String customSortString(String order, String s) {

        Map <Character, Integer> map = new HashMap<> ();
        char[] arr = new char[s.length()];

        for (int i=0; i<order.length(); i++) { map.put(order.charAt(i), i); }
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) { 
                int index = map.get(c);
                arr[index] = c; 
            }
        }
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) { 
                arr[i] = c;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : arr) { sb.append(c); }
        return sb.toString();
    }
}
*/