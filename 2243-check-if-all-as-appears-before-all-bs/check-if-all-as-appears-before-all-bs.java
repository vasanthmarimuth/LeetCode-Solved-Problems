class Solution {
    public boolean checkString(String s) {
        boolean ans=true;
        char[] arr=s.toCharArray();
        if(s.length()==1){
            return true;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]=='b'){
                ans=true;
                if(arr[i+1]=='a'){
                    ans=false;
                    break;
                }
            }
        }
        return ans;
    }
}