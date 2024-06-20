class Solution {
    public int balancedStringSplit(String s) {
        int equal=0;
        int substring=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                equal++;
            }else{
                equal--;
            }
            if(equal==0){
                substring++;
            }

        }
        return substring;
    }
}