class Solution {
    public int reverse(int x) {
        int sign=x<0?-1:1;
        x=Math.abs(x);
        int reversed=0;
        while(x!=0){
            int rem=x%10;
            if(reversed>(Integer.MAX_VALUE - rem)/10) return 0;
            reversed=reversed*10+rem;
            x/=10;
        }
        return sign*reversed;
    }
}