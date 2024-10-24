package StringOperations;

public class StringUtils {
	// Method to find length of the string
    public int findLength(String str) {
        return str.length();
    }

    // Method to replace a character with a new character
    public String replaceCharacter(String str, char oldChar, char newChar) {
        return str.replace(oldChar, newChar);
    }

    // Method to count words in a string
    public int wordCount(String str) {
        if (str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }
}

