class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> freqMap=new HashMap<>();

        for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                int freqA=freqMap.get(a);
                int freqB=freqMap.get(b);
                
                if(freqA!=freqB){
                    return freqA-freqB;
                }else{
                    return b-a;
                }
            }
        });
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
}