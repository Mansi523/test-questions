
public class Solution6 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // If the array is empty or null, return an empty string
        }

        String prefix = strs[0]; // Initialize prefix with the first string

        // Iterate through the strings
        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            int j = 0;

            // Compare characters of current string with the prefix
            while (j < prefix.length() && j < current.length() && prefix.charAt(j) == current.charAt(j)) {
                j++;
            }

            // Update prefix to the common part found so far
            prefix = prefix.substring(0, j);

            // If no common prefix found, return an empty string
            if (prefix.equals("")) {
                return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix: " + longestCommonPrefix(strs));
    }
}
