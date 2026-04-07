

class Solution {
    public int hammingWeight(int n) {
        
        int result=0;
        for(int i=0;i<32;i++)
        {
            n= n << 1;
            if(n<0)
                result++;
        }
        return result;
    }
}
