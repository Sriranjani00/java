import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Map to store characters and their last seen index
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character was seen before AND is within the current window
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= left) {
                // Jump the left pointer to the right of the previous occurrence
                left = charMap.get(currentChar) + 1;
            }

            // Update the map with the current character's latest position
            charMap.put(currentChar, right);

            // Calculate the current window size and update max
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
