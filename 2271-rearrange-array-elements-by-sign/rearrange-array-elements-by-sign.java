class Solution {
    public int[] rearrangeArray(int[] nums) {
    //     ArrayList<Integer> p=new ArrayList<>();
    //     ArrayList<Integer> n=new ArrayList<>();
    //     ArrayList<Integer> r=new ArrayList<>();

    //     int len=nums.length;
    //     for(int i=0;i<len;i++){
    //         if(nums[i]<0){
    //             n.add(nums[i]);
    //         }else{
    //             p.add(nums[i]);
    //         }
    //     }
    //     for(int i=0;i<len/2;i++){
    //         r.add(p.get(i));
    //         r.add(n.get(i));
    //     }
    //     for(int i=0;i<len;i++){
    //         nums[i]=r.get(i);
    //     }
    // return nums;
    int n=nums.length;
    int l1=0,l2=1;
    int[] ans=new int[n];

    for(int i=0;i<n;i++){
        if(nums[i]<0){
            ans[l2]=nums[i];
            l2+=2;
        }else{
            ans[l1]=nums[i];
            l1+=2;
        }
    }
    return ans;
    }
}