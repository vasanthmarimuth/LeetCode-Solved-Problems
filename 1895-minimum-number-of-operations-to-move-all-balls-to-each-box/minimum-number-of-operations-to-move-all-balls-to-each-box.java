class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if(boxes.charAt(j)!='0' && i!=j){
                    sum+=Math.abs(i-j);
                }
            }
            arr[i]=sum;
        }
        return arr;
    }
}