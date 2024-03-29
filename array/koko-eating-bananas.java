class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low=1;
       int high=findMax(piles); //find max element
       //binary search

       while(low<=high)
       {
           int mid = (low+high)/2;

           int totalHour=totalHourRequired(piles,mid); //calculate total hr req

           if(totalHour<=h)
           {
               high=mid-1;
           }
           else
           {
               low=mid+1;
           }
       }
       return low;
    }

    public int findMax(int[] piles)
    {
        int max=Integer.MIN_VALUE;

        int n=piles.length;

        for(int i=0; i<n ; i++)
        {
            max=Math.max(piles[i],max);
        }
        return max;
    }
    public int totalHourRequired(int[] piles, int hour)
    {
        int totalhour=0;
        int n=piles.length;

        for(int i=0; i<n; i++)
        {
            totalhour +=Math.ceil((double)(piles[i])/(double)(hour));
        }
        return totalhour;
    }
}
