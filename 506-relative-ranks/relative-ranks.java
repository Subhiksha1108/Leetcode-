class Solution {
    public String[] findRelativeRanks(int[] score) {
      PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(score[b]-score[a]));
      for(int i=0;i<score.length;i++)
      {
        pq.add(i);
      }  
      
      String[] res=new String[score.length];
      int rank=1;
      while(!pq.isEmpty())
      {
        int index=pq.poll();
        if(rank==1)
        {
            res[index]="Gold Medal";
          
        }
        else if(rank==2)
        {
            res[index]="Silver Medal";
        }
        else if(rank==3)
        {
            res[index]="Bronze Medal";
        }
        else
        {
            res[index]=String.valueOf(rank);
        }
        rank++;
      }
      return res;
    }
}