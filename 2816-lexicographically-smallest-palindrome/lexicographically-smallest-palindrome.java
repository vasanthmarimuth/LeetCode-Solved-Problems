class Solution {
    public String makeSmallestPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                int a=(int)s.charAt(i);
                int b=(int)s.charAt(j);
                if(a>b)sb.setCharAt(i,s.charAt(j));
                else sb.setCharAt(j,s.charAt(i));
                i++;
                j--;
            }
        }
        return sb.toString();
    }
}