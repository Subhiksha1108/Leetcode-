class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        HashMap<Integer,Integer> f=new HashMap<>();
        for(int n:map.values())
        {
            f.put(n,f.getOrDefault(n,0)+1);
        }
        for(int n:nums)
        
            if(f.get(map.get(n))==1) return n;
        
        return -1;
    }
}