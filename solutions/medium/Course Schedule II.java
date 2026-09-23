// Title: Course Schedule II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/course-schedule-ii/

            int course = queue.poll();
            completed++;
            ans[indx]= course;
            indx++;

            for (int next : adj.get(course)) {

                indegree[next]--;

                if (indegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }
