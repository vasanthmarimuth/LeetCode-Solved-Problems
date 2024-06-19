class Solution {
    public int uniquePaths(int m, int n) {
       int[][] s=new int[m][n];
       for(int i=0;i<m;i++){
        s[i][0]=1;
       }
       for(int i=0;i<n;i++){
        s[0][i]=1;
       }
       for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
            s[i][j]=s[i][j-1]+s[i-1][j];
        }
       }
       return s[m-1][n-1];
    }
}