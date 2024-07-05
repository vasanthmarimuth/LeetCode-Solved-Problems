class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        int valueindex=1;
        int freqindex=0;
        for(int i=0;i<nums.length/2;i++){
            int freq=nums[freqindex];
            int value=nums[valueindex];
            freqindex+=2;
            valueindex+=2;
            for(int j=0;j<freq;j++){
                al.add(value);
            }
        }
        int[] ans=new int[al.size()];
        for(int i=0;i<al.size();i++){
            ans[i]=al.get(i);
        }
        return ans;
    }
}