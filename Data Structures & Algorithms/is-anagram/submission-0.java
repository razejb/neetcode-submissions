class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        if(s.length() != t.length()){
            return false;
        } else {
            Arrays.sort(sChars);
            Arrays.sort(tChars);

            return Arrays.equals(sChars, tChars);
        }
    }
}