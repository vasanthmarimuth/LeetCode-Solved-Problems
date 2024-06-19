class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> n=new ArrayList<>();
        ArrayList<Integer> r=new ArrayList<>();

        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]<0){
                n.add(nums[i]);
            }else{
                p.add(nums[i]);
            }
        }
        for(int i=0;i<len/2;i++){
            r.add(p.get(i));
            r.add(n.get(i));
        }
        for(int i=0;i<len;i++){
            nums[i]=r.get(i);
        }
    return nums;
    }
}