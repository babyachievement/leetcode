/**
 * date: 2018/9/20 17:28
 */

package com.babyachievement.top100;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/course-schedule/description/
 */
public class CourseSchedule207 {
    static class Vertex {
        int val;

        public Vertex(int val) {
            this.val = val;
        }

        boolean      visited;
        List<Vertex> prerequisite = new ArrayList<>();
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Vertex> prerequisite = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            prerequisite.add(new Vertex(i));
        }

        for (int i = 0; i < prerequisites.length; i++) {
            final Vertex vertex1 = prerequisite.get(prerequisites[i][0]);
            final Vertex vertex2 = prerequisite.get(prerequisites[i][1]);
            vertex1.prerequisite.add(vertex2);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(prerequisite.get(i))) {
                return false;
            }
        }

        return true;
    }

    boolean dfs(Vertex vertex) {
        boolean result = true;
        if (vertex.visited) {
            result = false;
            vertex.visited = false;
        } else {
            vertex.visited = true;

            final List<Vertex> prerequisite = vertex.prerequisite;
            if (prerequisite.isEmpty()) {
                result = true;
            } else {
                for (Vertex v : prerequisite) {
                    if (!dfs(v)) {
                        result = false;
                        break;
                    }
                }
            }

            vertex.visited = false;
        }

        return result;
    }
}
