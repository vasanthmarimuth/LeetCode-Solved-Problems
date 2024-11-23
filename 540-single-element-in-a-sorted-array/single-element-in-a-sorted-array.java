class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length <= 2) return nums[0];  // Handle edge case if the array has two elements

        // Iterate through the array and check if the element is not repeated
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] != nums[i] && nums[i] != nums[i + 1]) {
                return nums[i];  // Return the single element if it's found
            }
        }
        
        // If no element is found in the loop, return the last element (edge case)
        return nums[nums.length - 1]!=nums[nums.length-2]?nums[nums.length-1]:nums[0];
    }
}
