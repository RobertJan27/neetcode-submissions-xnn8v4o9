/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
          for(int i=0;i< intervals.size();i++)
          {
            for(int j=i+1;j<intervals.size();j++)
                if(intervals.get(i).start>intervals.get(j).start)
                {
                    Interval aux=intervals.get(i);
                    intervals.set(i,intervals.get(j));
                    intervals.set(j,aux);
                }
          }
            
          for(int i=0;i<intervals.size()-1;i++)
          {
            
          if(intervals.get(i).end>intervals.get(i+1).start) 
            return false; 
          }
        return true;
    }
}
