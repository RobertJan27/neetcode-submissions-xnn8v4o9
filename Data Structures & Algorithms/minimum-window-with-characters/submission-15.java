class Solution {
    public String minWindow(String s, String t) {
        
        if(s.length()<t.length())
        return "";
        int l=0;
        int r=0;
        int min=1000;
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : t.toCharArray()) {
        freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
       
        HashMap<Character, Integer> set = new HashMap<>();
        String rez= "";
        Boolean flag=false;

        while(r<s.length())
        {
            if(flag==false)
            {
            Character c= s.charAt(r);
            set.put(c,set.getOrDefault(c,0)+1);
            }

            flag=true;
            for(int i=0;i<t.length();i++)
            {
                if(set.getOrDefault(t.charAt(i),0)< freq.get(t.charAt(i)))
                    {
                        flag=false;
                        continue;
                    }
            }

            
            if(flag==true)
            {
                System.out.println(rez + " "+ min);
                if((r-l) <min)
                   {
                    min=r-l; 
                    rez=s.substring(l,r+1);  
                    }
                set.put(s.charAt(l),set.get(s.charAt(l))-1);
                l++;
            }
            else
            {
            r++;
            }
        }
        return rez;
    }
}
