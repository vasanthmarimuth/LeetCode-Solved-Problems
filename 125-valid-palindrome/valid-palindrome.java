class Solution {
    public boolean isPalindrome(String s) {
        // int i=0;
        // int n=s.length();
        // String a="";
        // while(i<n){
        //     if((Character.isLetterOrDigit(s.charAt(i)))){
        //         a+=s.charAt(i);
        //     }
        //     i++;
        // }
        // String c=a.toLowerCase();
        // StringBuilder b=new StringBuilder(c);
        // b.reverse();
        // if(c.equals(b.toString())){
        //     return true;
        // }
        // return false;
        s=s.replaceAll("[^A-Za-z0-9]","");
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
