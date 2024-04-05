
public class Solution3 {
    public static String findShortestWord(String input) {
        // Split the input string into words
        String[] words = input.split("\\s+");

        // Initialize the shortest word with the first word
        String shortestWord = words[0];

        // Iterate through the words to find the shortest one
        for (int i = 1; i < words.length; i++) {
            // If the current word is shorter than the shortest word, update the shortest word
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }

        return shortestWord;
    }

    public static void main(String[] args) {
        String input = "Implement a function that returns the shortest word in the string";
        String shortestWord = findShortestWord(input);
        System.out.println("Shortest word: " + shortestWord);
    }
}
