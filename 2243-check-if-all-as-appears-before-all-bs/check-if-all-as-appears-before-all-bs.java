class Solution {
    public boolean checkString(String s) {
       boolean ans=true;
       char arr[]=s.toCharArray();
       for(int i=0;i<s.length()-1;i++){
        if( arr[i]=='b' && arr[i+1]=='a'){
            ans= false;
            break;
        }
       }
return ans;

   }
}