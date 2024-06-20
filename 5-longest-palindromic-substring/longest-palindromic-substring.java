class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();

        String ans="";
     for(int i=0;i<n;i++){
        for(int j=n-1;j>=i;j--){
            if(s.charAt(i)==s.charAt(j)){
                if(palin(s.substring(i,j+1))){
                    ans=ans.length()<s.substring(i,j+1).length()?s.substring(i,j+1):ans;
                    break;
                }
            }
        }
     }  
     return ans;
    }
    boolean palin(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}