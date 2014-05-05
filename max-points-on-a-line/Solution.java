/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
import java.util.Map;
import java.util.HashMap;

public class Solution {
    private static class Point {
      int x;
      int y;
      Point() { x = 0; y = 0; }
      Point(int a, int b) { x = a; y = b; }
  }

    public int maxPoints(Point[] points) {
        Map<Double, Integer> map = new HashMap<Double, Integer>();
        int max = 1;
        if (points == null || points.length == 0){
            return 0;
        }


        for (int i=0; i<points.length-1; i++){
            map.clear();

            map.put((double)Integer.MIN_VALUE, 1);

            int dup = 0;
            for (int j=i+1; j<points.length; j++){
                if (points[j].x == points[i].x && points[j].y == points[i].y){
                    dup++;
                    continue;
                }

                double key = points[j].x - points[i].x == 0?Integer.MAX_VALUE:0.0+(double)(points[j].y - points[i].y)/(double)(points[j].x - points[i].x);
                
                if (map.containsKey(key)){
                    map.put(key, map.get(key)+1);
                }else{
                    map.put(key, 2);
                }   
            }   

            for (int val : map.values()){
                if (dup + val > max) max = dup + val;
            }
        }

        return max;
    }

}