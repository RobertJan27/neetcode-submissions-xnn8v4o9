class Solution {
    public boolean isValid(String s) {

        if(s.length()%2==1)
        return false;

        Stack<Character> st1 = new Stack<>();
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==40 || s.charAt(i)==91 || s.charAt(i)==123)
                st1.push(s.charAt(i));
            else
            {
                if(st1.empty())
                return false;

                Character t=st1.pop();
                if((t+1)==s.charAt(i) || (t+2)==s.charAt(i))
                {}
                else
                return false;
            }

        if(st1.empty())
        return true;
        else
        return false;
    }
}
