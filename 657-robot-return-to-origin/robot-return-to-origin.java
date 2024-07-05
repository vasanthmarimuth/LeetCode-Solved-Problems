class Solution {
    public boolean judgeCircle(String moves) {
        int ans1=0;
        int ans2=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U') ans1=ans1+1;
            else if(moves.charAt(i)=='D') ans1=ans1-1;
            else if(moves.charAt(i)=='R') ans2=ans2+1;
            else if(moves.charAt(i)=='L') ans2=ans2-1;
        }
        return ans1==0 && ans2==0;
    }
}