class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","");
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
