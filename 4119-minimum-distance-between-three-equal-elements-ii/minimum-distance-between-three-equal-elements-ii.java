class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            {
                map.computeIfAbsent(nums[i],x->new ArrayList()).add(i);
            }
                int ans=Integer.MAX_VALUE;
                for(List<Integer> pos:map.values())
                    {
                        int m=pos.size();
                        if(m<3)continue;
                        for(int i=0;i+2<m;i++)
                            {
                                int a=pos.get(i);
                                int c=pos.get(i+2);
                                int dist=2*(c-a);
                                ans=Math.min(ans,dist);
                            }
                    }
            return ans==Integer.MAX_VALUE ?-1:ans;
    }
}