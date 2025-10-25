class Solution {
    public int removeDuplicates(int[] nums) {
       int indexForNextElement=1;
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i]>nums[i-1])
        {
        nums[indexForNextElement]=nums[i];
        indexForNextElement++;
        }
       }
       return indexForNextElement;
    }
}
