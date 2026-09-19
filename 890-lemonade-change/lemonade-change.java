class Solution {
    public boolean lemonadeChange(int[] bills) {
        int countf=0;
        int countt=0;
        int counto=0;
        for(int n:bills)
        {
            if(n==5)
            {
                countf++;
            }
            if(n==10)
            {
              
                if(countf>0)
                {
                    countf--;
                    countt++;
                }
                else
                {
                    return false;
                }
            }
            if(n==20)
            {
                if(countf>=1 && countt>0)
                {
                   countf--;
                   countt--;
                   counto++;
                }
                else if(countf>=3)
                {
                    countf=countf-3;
                    counto++;
                }
                else{
                    return false;
                }
                
            }
        }
        return true;
    }
}