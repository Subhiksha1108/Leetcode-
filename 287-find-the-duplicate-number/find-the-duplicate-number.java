class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int ans=0;
        for(int n:nums)
        {
            if(set.contains(n))
            {
                ans=n;
            }
            set.add(n);
        }
        return ans;
    }
}