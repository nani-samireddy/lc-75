class Solution {
    public String mergeAlternately(String word1, String word2) {
        int index = 0;
        String result = "";
        while ( index < word1.length() && index < word2.length() ) {
            result += word1.charAt(index);
            result += word2.charAt(index);
            ++index;
        }

        if ( index < word1.length() ) {
            result += word1.substring(index);
        }
        if (index < word2.length()) {
            result += word2.substring(index);
        }

        return result;
    }
}
