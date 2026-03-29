class Solution {




    public int characterReplacement(String s, int k) {

        HashMap<Character,Integer> freq = new HashMap<Character,Integer>();
        int l=0;
        int r=0;
        int rez=0;
        while(r<s.length())
        {
            int x= freq.getOrDefault(s.charAt(r),0);
            freq.put(s.charAt(r),x+1);
            int freqMax=0;
            for (Integer ch :freq.values())
                if(ch>freqMax)
                freqMax=ch;
            if((r-l-freqMax+1 ) <=k || (freqMax== r-l+1))
            {
                if(r-l+1>rez)
                rez=r-l+1;
                r++;
            }
            else
            {
                freq.put(s.charAt(r),x);
                freq.put(s.charAt(l),freq.get(s.charAt(l))-1);
                l++;
            }
        }

        return rez;

    }
}
