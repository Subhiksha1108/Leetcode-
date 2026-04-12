class Solution {
    public boolean divideArray(int[] nums) {
        int[] count=new int[501];
        for(int num:nums)
        {
            count[num]++;
        }
        for(int c:count)
        {
            if((c&1)==1)
            {
            return false;
        }
        }
        return true;
    }
  
}