class Solution {
    public boolean lemonadeChange(int[] bills) {
        boolean flag=true;
        int a=0,b=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                a++;
            }
            else if( bills[i]==10)
            {
                if(a>=1)
                {
                    a--;
                    b++;
                }
                else 
                {
                    flag=false;
                    break;
                }
            }
            else if(bills[i]==20)
            {
                if(a>=1 && b>=1)
                {
                    a--;
                    b--;
                } 
                else if(a>=3)
                {
                    a-=3;
                }
                else
                {
                    flag=false;
                    break;
                }
            }
        }
        return flag;
        
    }
}