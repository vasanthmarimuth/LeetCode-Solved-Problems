class Solution {
    public int firstMissingPositive(int[] nums) {
        int max=Integer.MAX_VALUE;
        Set<Integer> st=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(max<nums[i]) max=nums[i];
        // }
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        for(int i=1;i<max;i++){
            if(st.add(i)) return i;
        }
        return 0;
    }
}