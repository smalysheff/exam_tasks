package ru.smal.easy.easy58;

/**
 * 58. Length of Last Word
 * <p>
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * <p>
 * A word is a maximal substring consisting of non-space characters only.
 * <p>
 * Example 1:
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * <p>
 * Example 2:
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * <p>
 * Example 3:
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        String[] array = s.split("\\s+");
        int lastIndex = array.length - 1;
        return array[lastIndex].length();
    }
}
