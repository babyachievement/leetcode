/**
 * date: 2018/9/19 22:09
 */

package com.babyachievement.top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/the-skyline-problem/description/
 * <p>
 * Height of new Strip is always obtained by taking maximum of following
 * (a) Current height from skyline1, say 'h1'.
 * (b) Current height from skyline2, say 'h2'
 * h1 and h2 are initialized as 0. h1 is updated when a strip from
 * SkyLine1 is added to result and h2 is updated when a strip from
 * SkyLine2 is added.
 * <p>
 * Skyline1 = {(1, 11),  (3, 13),  (9, 0),  (12, 7),  (16, 0)}
 * Skyline2 = {(14, 3),  (19, 18), (22, 3), (23, 13),  (29, 0)}
 * Result = {}
 * h1 = 0, h2 = 0
 * <p>
 * Compare (1, 11) and (14, 3).  Since first strip has smaller left x,
 * add it to result and increment index for Skyline1.
 * h1 = 11, New Height  = max(11, 0)
 * Result =   {(1, 11)}
 * <p>
 * Compare (3, 13) and (14, 3). Since first strip has smaller left x,
 * add it to result and increment index for Skyline1
 * h1 = 13, New Height =  max(13, 0)
 * Result =  {(1, 11), (3, 13)}
 * <p>
 * Similarly (9, 0) and (12, 7) are added.
 * h1 = 7, New Height =  max(7, 0) = 7
 * Result =   {(1, 11), (3, 13), (9, 0), (12, 7)}
 * <p>
 * Compare (16, 0) and (14, 3). Since second strip has smaller left x,
 * it is added to result.
 * h2 = 3, New Height =  max(7, 3) = 7
 * Result =   {(1, 11), (3, 13), (9, 0), (12, 7), (14, 7)}
 * <p>
 * Compare (16, 0) and (19, 18). Since first strip has smaller left x,
 * it is added to result.
 * h1 = 0, New Height =  max(0, 3) = 3
 * Result =   {(1, 11), (3, 13), (9, 0), (12, 7), (14, 3), (16, 3)}
 * <p>
 * Since Skyline1 has no more items, all remaining items of Skyline2
 * are added
 * Result =   {(1, 11), (3, 13), (9, 0), (12, 7), (14, 3), (16, 3),
 * (19, 18), (22, 3), (23, 13), (29, 0)}
 * <p>
 * One observation about above output is, the strip (16, 3) is redundant
 * (There is already an strip of same height). We remove all redundant
 * strips.
 * Result =   {(1, 11), (3, 13), (9, 0), (12, 7), (14, 3), (19, 18),
 * (22, 3), (23, 13), (29, 0)}
 * <p>
 * In below code, redundancy is handled by not appending a strip if the
 * previous strip in result has same height.
 */
public class TheSkylineProblem218 {

    /**
     * Represents either start or end of building
     */
    static class BuildingPoint implements Comparable<BuildingPoint> {
        int     x;
        boolean isStart;
        int     height;

        @Override
        public int compareTo(BuildingPoint o) {
            //first compare by x.
            //If they are same then use this logic
            //if two starts are compared then higher height building should be picked first
            //if two ends are compared then lower height building should be picked first
            //if one start and end is compared then start should appear before end
            if (this.x != o.x) {
                return this.x - o.x;
            } else {
                return (this.isStart ? -this.height : this.height) - (o.isStart ? -o.height : o.height);
            }
        }
    }

    public List<int[]> getSkyline(int[][] buildings) {

        //for all start and end of building put them into List of BuildingPoint
        BuildingPoint[] buildingPoints = new BuildingPoint[buildings.length * 2];
        int             index          = 0;
        for (int building[] : buildings) {
            buildingPoints[index] = new BuildingPoint();
            buildingPoints[index].x = building[0];
            buildingPoints[index].isStart = true;
            buildingPoints[index].height = building[2];

            buildingPoints[index + 1] = new BuildingPoint();
            buildingPoints[index + 1].x = building[1];
            buildingPoints[index + 1].isStart = false;
            buildingPoints[index + 1].height = building[2];
            index += 2;
        }
        Arrays.sort(buildingPoints);

        //using TreeMap because it gives log time performance.
        //PriorityQueue in java does not support remove(object) operation in log time.
        TreeMap<Integer, Integer> queue = new TreeMap<>();
        //PriorityQueue<Integer> queue1 = new PriorityQueue<>(Collections.reverseOrder());
        queue.put(0, 1);
        //queue1.add(0);
        int         prevMaxHeight = 0;
        List<int[]> result        = new ArrayList<>();
        for (BuildingPoint buildingPoint : buildingPoints) {
            //if it is start of building then add the height to map. If height already exists then increment
            //the value
            if (buildingPoint.isStart) {
                queue.compute(buildingPoint.height, (key, value) -> {
                    if (value != null) {
                        return value + 1;
                    }
                    return 1;
                });
                //  queue1.add(cp.height);
            } else { //if it is end of building then decrement or remove the height from map.
                queue.compute(buildingPoint.height, (key, value) -> {
                    if (value == 1) {
                        return null;
                    }
                    return value - 1;
                });
                // queue1.remove(cp.height);
            }
            //peek the current height after addition or removal of building x.
            int currentMaxHeight = queue.lastKey();
            //int currentMaxHeight = queue1.peek();
            //if height changes from previous height then this building x becomes critcal x.
            // So add it to the result.
            if (prevMaxHeight != currentMaxHeight) {
                result.add(new int[]{buildingPoint.x, currentMaxHeight});
                prevMaxHeight = currentMaxHeight;
            }
        }
        return result;
    }

    /**
     * Divide and Conquer
     *
     * @param buildings
     * @return
     */
    public List<int[]> getSkyline2(int[][] buildings) {
        return merge(buildings, 0, buildings.length - 1);
    }

    private LinkedList<int[]> merge(int[][] buildings, int lo, int hi) {
        LinkedList<int[]> res = new LinkedList<>();
        if (lo > hi) {
            return res;
        } else if (lo == hi) {
            res.add(new int[]{buildings[lo][0], buildings[lo][2]});
            res.add(new int[]{buildings[lo][1], 0});
            return res;
        }
        int               mid   = lo + (hi - lo) / 2;
        LinkedList<int[]> left  = merge(buildings, lo, mid);
        LinkedList<int[]> right = merge(buildings, mid + 1, hi);
        int               leftH = 0, rightH = 0;
        while (!left.isEmpty() || !right.isEmpty()) {
            long x1 = left.isEmpty() ? Long.MAX_VALUE : left.peekFirst()[0];
            long x2 = right.isEmpty() ? Long.MAX_VALUE : right.peekFirst()[0];
            int  x  = 0;
            if (x1 < x2) {
                int[] temp = left.pollFirst();
                x = temp[0];
                leftH = temp[1];
            } else if (x1 > x2) {
                int[] temp = right.pollFirst();
                x = temp[0];
                rightH = temp[1];
            } else {
                x = left.peekFirst()[0];
                leftH = left.pollFirst()[1];
                rightH = right.pollFirst()[1];
            }
            int h = Math.max(leftH, rightH);
            if (res.isEmpty() || h != res.peekLast()[1]) {
                res.add(new int[]{x, h});
            }
        }
        return res;
    }
}
