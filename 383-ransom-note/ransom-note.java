class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       for(int i=0;i<ransomNote.length();i++){
            int n=magazine.indexOf(ransomNote.charAt(i));
            if(n==-1){
                return false;
            }
            magazine=magazine.substring(0,n)+magazine.substring(n+1);
       }
       return true;
    }
}