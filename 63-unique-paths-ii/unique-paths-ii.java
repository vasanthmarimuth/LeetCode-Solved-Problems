class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        int m=ob.length;
        int n=ob[0].length;
    int arr[][]=new int[m][n];

    if(ob[0][0]==1 || ob[m-1][n-1]==1){
        return 0;
    }
    for(int i=0;i<m;i++){
        if(ob[i][0]==1){
            break;
        }
        arr[i][0]=1;
    }
    for(int i=0;i<n;i++){
        if(ob[0][i]==1){
            break;
        }
        arr[0][i]=1;
    }
    for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
            if(ob[i][j]==1){
                arr[i][j]=0;
            }else{
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
    }
    return arr[m-1][n-1];
    }
}