import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Jiacheng Huang
 * @date 2019/03/01 01:24
 */
public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        List<Point> list = new ArrayList<>();
        int[][] result = new int[K][2];
        for (int i = 0; i < points.length; i++) {
            double distance = distance(points[i]);
            Point point = new Point();
            point.distance = distance;
            point.index = i;
            list.add(point);
        }
        list.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.distance > o2.distance) {
                    return 1;
                } else if (o1.distance == o2.distance) {
                    return 0;
                } else {
                    return -1;
                }

            }
        });
        for (int i = 0; i < result.length; i++) {
            result[i] = points[list.get(i).index];
        }
        return result;
    }

    private double distance(int[] point) {
        return Math.sqrt(point[0] * point[0] + point[1] * point[1]);
    }

    class Point {
        int index;
        double distance;
    }
}
