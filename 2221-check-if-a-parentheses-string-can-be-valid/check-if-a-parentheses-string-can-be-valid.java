class Solution {
    public boolean canBeValid(String s, String locked) {
        int n=s.length();
        if(n%2==1)return false;

        int balanceCount =0 ;

        for(int i=0;i<n;i++){
            if(locked.charAt(i)=='0' || s.charAt(i)=='('){
                balanceCount++;
            }else{
                balanceCount--;
            }
            if(balanceCount<0)return false;
        }

        balanceCount=0;

        for(int i=n-1;i>=0;i--){
            if(locked.charAt(i)=='0' || s.charAt(i)==')'){
                balanceCount++;
            }else{
                balanceCount--;
            }
            if(balanceCount<0)return false;
        }

         return true;
    }
}