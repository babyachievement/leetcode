package com.babyachievement.top.interviews;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/course-schedule-ii/description/
 */
public class CourseScheduleII210 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Set<Integer>> prerequisiteList = new ArrayList<>();
        List<Set<Integer>> afterList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            prerequisiteList.add(new HashSet<>());
            afterList.add(new HashSet<>());
        }

        int[] result = new int[numCourses];

        boolean[] finished = new boolean[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            prerequisiteList.get(prerequisites[i][0]).add(prerequisites[i][1]);
            afterList.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }


        int count = 0;

        for (int j = 0; j < numCourses; j++) {
            for (int i = 0; i < numCourses; i++) {
                if (!finished[i]) {
                    if (prerequisiteList.get(i).isEmpty()) {
                        result[count++] = i;
                        finished[i] = true;

                        Set<Integer> set = afterList.get(i);
                        for (Integer after : set) {
                            prerequisiteList.get(after).remove(i);
                        }
                    }
                }
            }
        }

        return result;

    }

    public class Node {
        int course;
        Node next;

        public Node(int c, Node n) {
            course = c;
            next = n;
        }
    }

    public int[] findOrder2(int numCourses, int[][] prerequisites) {
        int[] degree = new int[numCourses];
        Node[] nextList = new Node[numCourses];
        int i;
        for (i = 0; i < prerequisites.length; i++) {
            nextList[prerequisites[i][1]] = new Node(prerequisites[i][0], nextList[prerequisites[i][1]]);
            degree[prerequisites[i][0]]++;
        }
        int[] stack = new int[numCourses];
        int sp = 0;
        for (i = 0; i < numCourses; i++) {
            if (degree[i] == 0)
                stack[sp++] = i;
        }
        int[] result = new int[numCourses];
        int current = 0;
        while (current < numCourses) {
            if (sp == 0)
                return new int[0];
            i = stack[--sp];
            result[current++] = i;
            Node p = nextList[i];
            while (p != null) {
                degree[p.course]--;
                if (degree[p.course] == 0)
                    stack[sp++] = p.course;
                p = p.next;
            }
        }
        return result;
    }

}
