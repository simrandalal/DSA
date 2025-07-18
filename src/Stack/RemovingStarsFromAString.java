class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                result.deleteCharAt(result.length() - 1); // remove last character
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
