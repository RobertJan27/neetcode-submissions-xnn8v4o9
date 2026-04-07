class Solution {
    public int[] countBits(int n) {

        int array[] = new int[n+1];
        for(int i=0; i<=n; i++)
        {
            array[i]=0;
            int copy=i;
            while(copy!=0)
            {
                if(copy<0)
                    array[i]++;
                copy= copy << 1;
            }
        }
        return array;
    }
}
